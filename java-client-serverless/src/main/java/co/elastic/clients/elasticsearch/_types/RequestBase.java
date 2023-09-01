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

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Objects;

// typedef: _types.RequestBase

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.RequestBase">API
 *      specification</a>
 */

public abstract class RequestBase {
	public RequestBase() {
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				WithJsonObjectBuilderBase<BuilderT> {
		protected abstract BuilderT self();

	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder(this.getClass().getSimpleName()).append(": ");

		try {
			@SuppressWarnings("unchecked")
			Endpoint<RequestBase, ?, ?> endpoint = (Endpoint<RequestBase, ?, ?>) this.getClass()
					.getDeclaredField("_ENDPOINT").get(null);

			sb.append(endpoint.method(this)).append(" ").append(endpoint.requestUrl(this));

			Map<String, String> params = endpoint.queryParameters(this);
			String delim = "?";
			for (Map.Entry<String, String> param : params.entrySet()) {
				sb.append(delim);
				delim = "&";
				sb.append(param.getKey()).append("=").append(URLEncoder.encode(param.getValue(), "UTF-8"));
			}

		} catch (NoSuchFieldException | IllegalAccessException e) {
			// No endpoint, ignore
		} catch (UnsupportedEncodingException e) {
			// Should not happen (UTF-8 is builtin)
		}

		if (this instanceof JsonpSerializable) {
			sb.append(' ');
			JsonpUtils.toString((JsonpSerializable) this, sb);
		}

		return sb.toString();
	}

}
