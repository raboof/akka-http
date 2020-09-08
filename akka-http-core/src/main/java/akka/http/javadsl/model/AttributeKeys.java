/*
 * Copyright (C) 2019-2020 Lightbend Inc. <https://www.lightbend.com>
 */

package akka.http.javadsl.model;

import akka.http.javadsl.model.ws.WebSocketUpgrade;

import javax.net.ssl.SSLSession;

public final class AttributeKeys {
    public static final AttributeKey<RemoteAddress> remoteAddress =
            (AttributeKey<RemoteAddress>)(Object)akka.http.scaladsl.model.AttributeKeys.remoteAddress();
    public static final AttributeKey<WebSocketUpgrade> webSocketUpgrade =
            (AttributeKey<WebSocketUpgrade>)(Object)akka.http.scaladsl.model.AttributeKeys.webSocketUpgrade();
    public static final AttributeKey<SSLSession> sslSession =
            (AttributeKey<SSLSession>)(Object)akka.http.scaladsl.model.AttributeKeys.sslSession();
}
