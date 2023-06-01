FROM ubuntu:16.04
LABEL name="ghanshyam shukla"
LABEL name="gsgmca682@gmail.com"
ENV NAME iid
ENV PASS pass123
RUN pwd>/tmp/first.txt
RUN cd /tmp/
RUN pwd>/tmp/second.txt
WORKDIR /tmp
RUN pwd>/tmp/third.txt
RUN apt-get update && apt-get install -y openssh-server && apt-get install -y python
RUN useradd -d /home/iid -g root -G sudo -m -p $(echo $PASS |openssl  passwd -1 -stdin) $NAME
RUN whoami>/tmp/firstt.txt
USER $NAME
RUN whoami>/tmp/sectt.txt
RUN mkdir -p /tmp/project
#COPY test  /tmp/project/
COPY test/jdk-8u361-linux-x64.tar.gz  /tmp/project/
CMD ["python"]
#command should be only one.if there is multiple will take the last one
CMD ["python"]


