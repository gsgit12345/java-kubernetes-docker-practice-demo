package com.demo.project.java8.functionalint;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.Dsl;
import org.asynchttpclient.Response;

import java.util.concurrent.CompletableFuture;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamReusability {
    public static void main(String str[])
    {
        /*
        Although Java streams were designed to be operated only once, programmers still ask how to reuse a stream.
            From a simple web search, we can find many posts with this same issue asked in many different ways:
    "Is there any way to reuse a Stream in java 8?", "Copy a stream to avoid stream has already been operated upon or closed",
            "Java 8 Stream IllegalStateException", and others.
*/

//Can we reuse Java-8 Streams?
//simple  answer no.it will throw the exception A stream should be operated on (invoking an intermediate or terminal stream operation) only once.
// A stream implementation may throw IllegalStateException if it detects that the stream is being reused.

       // using iterator we can reuse and traverse the collection multiple times but using stream will throw problem.
       //promise means single assignment container
        getStreamData();
    }
    public static void getStreamData()
    {
        AsyncHttpClient client = Dsl.asyncHttpClient();

        Pattern pat =Pattern.compile("\\n");
        CompletableFuture<Stream<String>> csv = Dsl.asyncHttpClient()
                .prepareGet("http://api.worldweatheronline.com/premium/v1/past-weather.ashx?q=37.017,-7.933&date=2018-04-01&enddate=2018-04-30&tp=24&format=csv&key=54a4f43fc39c435fa2c143536183004")
                .execute()
                .toCompletableFuture()
                .thenApply(Response::getResponseBody)
                .thenApply(pat::splitAsStream);
     System.out.println(  csv.join().count());

    }
}
