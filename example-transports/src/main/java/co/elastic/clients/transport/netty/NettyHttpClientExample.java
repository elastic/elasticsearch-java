/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package co.elastic.clients.transport.netty;

import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.http.DefaultFullHttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpMethod;
import io.netty.handler.codec.http.HttpObject;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpUtil;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.handler.codec.http.LastHttpContent;
import io.netty.handler.ssl.SslContext;
import io.netty.handler.ssl.SslContextBuilder;
import io.netty.handler.ssl.util.InsecureTrustManagerFactory;
import io.netty.util.CharsetUtil;

import java.net.URI;

public class NettyHttpClientExample {
    private static final String HOST = "example.com";
    private static final int PORT = 80;

    public static void main(String[] args) {
        System.out.println("foo");
        //if (true) return;
        try {
            main0(args);
        } catch (Throwable thr) {
            thr.printStackTrace();
        }
        System.out.println("done");
    }

    public static void main0(String[] args) throws Exception {

        NioEventLoopGroup workerGroup = new NioEventLoopGroup();

        SslContext sslContext = SslContextBuilder.forClient()
            .trustManager(InsecureTrustManagerFactory.INSTANCE)
            .build();

        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(workerGroup)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.SO_KEEPALIVE, true)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel ch) throws Exception {
                        //ch.pipeline().addLast(sslContext.newHandler(ch.alloc()));
                        ch.pipeline().addLast(new HttpClientCodec());
                        //ch.pipeline().addLast(new HttpObjectAggregator(8192));
                        ch.pipeline().addLast(new SimpleChannelInboundHandler<HttpObject>() {

                            @Override
                            protected void channelRead0(ChannelHandlerContext ctx, HttpObject msg) throws Exception {
                                if (msg instanceof HttpResponse) {
                                    HttpResponse response = (HttpResponse) msg;

                                    System.err.println("STATUS: " + response.status());
                                    System.err.println("VERSION: " + response.protocolVersion());
                                    System.err.println();

                                    if (!response.headers().isEmpty()) {
                                        for (CharSequence name: response.headers().names()) {
                                            for (CharSequence value: response.headers().getAll(name)) {
                                                System.err.println("HEADER: " + name + " = " + value);
                                            }
                                        }
                                        System.err.println();
                                    }

                                    if (HttpUtil.isTransferEncodingChunked(response)) {
                                        System.err.println("CHUNKED CONTENT {");
                                    } else {
                                        System.err.println("CONTENT {");
                                    }
                                }
                                if (msg instanceof HttpContent) {
                                    HttpContent content = (HttpContent) msg;

                                    ByteBuf buf = content.content();
                                    System.err.println("Buffer: " + buf.readableBytes());
                                    //buf.retain();
                                    //buf.release();
                                    //System.err.print(buf.toString(CharsetUtil.UTF_8));
                                    //System.err.flush();

                                    if (content instanceof LastHttpContent) {
                                        System.err.println("} END OF CONTENT");
                                        ctx.close();
                                    }
                                }

                            }
                            @Override
                            public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
                                cause.printStackTrace();
                                ctx.close();
                            }
                        });
                    }
                });

            Channel channelFuture = bootstrap.connect(HOST, PORT).sync().channel();

            URI uri = new URI("http://" + HOST);
            String msg = "Hello, Server!";
            FullHttpRequest request = new DefaultFullHttpRequest(
                HttpVersion.HTTP_1_1, HttpMethod.GET, uri.toASCIIString(),
                Unpooled.wrappedBuffer(msg.getBytes(CharsetUtil.UTF_8)));

            request.headers().set(HttpHeaders.Names.HOST, HOST);
            request.headers().set(HttpHeaders.Names.CONNECTION, HttpHeaders.Values.CLOSE);
            //request.headers().set(HttpHeaders.Names.ACCEPT_ENCODING, HttpHeaders.Values.GZIP);

            System.err.println("after request 0");
            channelFuture.writeAndFlush(request);
            System.err.println("after request 1");
            channelFuture.closeFuture().sync();
            System.err.println("after request 2");
        } finally {
            workerGroup.shutdownGracefully().sync();
            System.err.println("after request 3");
        }
    }
}
