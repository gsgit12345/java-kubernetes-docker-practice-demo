FROM ubuntu:16.04
LABEL name="ghanshyam shukla"
LABEL name="gsgmca682@gmail.com"
ENV NAME iid2
ENV PASS pass123
RUN mkdir -p  /var/run/sshd
RUN apt-get update
RUN apt-get install -y python tree
#ENTRYPOINT [ "tree" ]
#RUN chmod +x test.sh
COPY test.sh /tmp/
RUN chmod +x /tmp/test.sh
ENTRYPOINT [ "/tmp/test.sh" ]

#CMD [ "--version" ]
#CMD [ "--help" ]