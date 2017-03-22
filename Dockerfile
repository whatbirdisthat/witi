FROM jenkins
MAINTAINER What Bird Is That
RUN \
    apt update \
&&  apt install maven
