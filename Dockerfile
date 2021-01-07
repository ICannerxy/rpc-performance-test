FROM reg.docker.alibaba-inc.com/terrence-cloud/centos:jdk8
MAINTAINER xuyang

COPY rpc.benchmark /home/admin/rpc.benchmark
COPY wrk /home/admin/wrk
COPY start.sh /home/admin/

#ADD target/rpc-performance-test-1.0.0.jar /home/admin/rpc.benchmark/ext/rpc-performance-test-1.0.0.jar

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
    && echo "Asia/Shanghai" > /etc/timezone \
    && chmod +x /home/admin/rpc.benchmark/benchmark.sh \
    && chmod +x /home/admin/wrk/wrk \
    && cd  /home/admin/rpc.benchmark/ext

ENTRYPOINT ["/bin/sh", "/home/admin/start.sh"]
