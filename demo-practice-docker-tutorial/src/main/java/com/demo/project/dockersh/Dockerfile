FROM ubuntu:16.04
LABEL name="ghanshyam shukla"
LABEL name="gsgmca682@gmail.com"
ENV NAME iid2
ENV PASS pass123
RUN mkdir -p  /var/run/sshd
RUN apt-get update
RUN apt-get install -y openssh-server
RUN apt-get update && apt-get install -y openssh-server && apt-get install -y python
RUN useradd -d /home/iid -g root -G sudo -m -p $(echo $PASS |openssl  passwd -1 -stdin) $NAME
#it is the ssh port
EXPOSE 22
CMD ["/usr/sbin/sshd","-D" ]

#do ssh iid@172.17.0.7  and pres enter and provide password pass123
# 192.168.146.241  =this is machine ip
#[iid@iid dockersh]$ ssh  iid@192.168.146.241 -p  32768   :-this  iid is user and 192.168.146.241 machine ip and 32768 is the exposed port
#[iid@iid dockersh]$ ssh  iid2@192.168.146.241 -p  32768   :-this  iid is user which is above  and 192.168.146.241 machine ip and 32768 is the exposed port