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

package co.elastic.clients.elasticsearch.nodes;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.Long;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: nodes._types.Http

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.Http">API
 *      specification</a>
 */
@JsonpDeserializable
public class Http implements JsonpSerializable {
	@Nullable
	private final Integer currentOpen;

	@Nullable
	private final Long totalOpened;

	private final List<Client> clients;

	private final Map<String, HttpRoute> routes;

	// ---------------------------------------------------------------------------------------------

	private Http(Builder builder) {

		this.currentOpen = builder.currentOpen;
		this.totalOpened = builder.totalOpened;
		this.clients = ApiTypeHelper.unmodifiable(builder.clients);
		this.routes = ApiTypeHelper.unmodifiableRequired(builder.routes, this, "routes");

	}

	public static Http of(Function<Builder, ObjectBuilder<Http>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Current number of open HTTP connections for the node.
	 * <p>
	 * API name: {@code current_open}
	 */
	@Nullable
	public final Integer currentOpen() {
		return this.currentOpen;
	}

	/**
	 * Total number of HTTP connections opened for the node.
	 * <p>
	 * API name: {@code total_opened}
	 */
	@Nullable
	public final Long totalOpened() {
		return this.totalOpened;
	}

	/**
	 * Information on current and recently-closed HTTP client connections. Clients
	 * that have been closed longer than the
	 * <code>http.client_stats.closed_channels.max_age</code> setting will not be
	 * represented here.
	 * <p>
	 * API name: {@code clients}
	 */
	public final List<Client> clients() {
		return this.clients;
	}

	/**
	 * Required - Detailed HTTP stats broken down by route
	 * <p>
	 * API name: {@code routes}
	 */
	public final Map<String, HttpRoute> routes() {
		return this.routes;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		if (this.currentOpen != null) {
			generator.writeKey("current_open");
			generator.write(this.currentOpen);

		}
		if (this.totalOpened != null) {
			generator.writeKey("total_opened");
			generator.write(this.totalOpened);

		}
		if (ApiTypeHelper.isDefined(this.clients)) {
			generator.writeKey("clients");
			generator.writeStartArray();
			for (Client item0 : this.clients) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.routes)) {
			generator.writeKey("routes");
			generator.writeStartObject();
			for (Map.Entry<String, HttpRoute> item0 : this.routes.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Http}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Http> {
		@Nullable
		private Integer currentOpen;

		@Nullable
		private Long totalOpened;

		@Nullable
		private List<Client> clients;

		private Map<String, HttpRoute> routes;

		/**
		 * Current number of open HTTP connections for the node.
		 * <p>
		 * API name: {@code current_open}
		 */
		public final Builder currentOpen(@Nullable Integer value) {
			this.currentOpen = value;
			return this;
		}

		/**
		 * Total number of HTTP connections opened for the node.
		 * <p>
		 * API name: {@code total_opened}
		 */
		public final Builder totalOpened(@Nullable Long value) {
			this.totalOpened = value;
			return this;
		}

		/**
		 * Information on current and recently-closed HTTP client connections. Clients
		 * that have been closed longer than the
		 * <code>http.client_stats.closed_channels.max_age</code> setting will not be
		 * represented here.
		 * <p>
		 * API name: {@code clients}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>clients</code>.
		 */
		public final Builder clients(List<Client> list) {
			this.clients = _listAddAll(this.clients, list);
			return this;
		}

		/**
		 * Information on current and recently-closed HTTP client connections. Clients
		 * that have been closed longer than the
		 * <code>http.client_stats.closed_channels.max_age</code> setting will not be
		 * represented here.
		 * <p>
		 * API name: {@code clients}
		 * <p>
		 * Adds one or more values to <code>clients</code>.
		 */
		public final Builder clients(Client value, Client... values) {
			this.clients = _listAdd(this.clients, value, values);
			return this;
		}

		/**
		 * Information on current and recently-closed HTTP client connections. Clients
		 * that have been closed longer than the
		 * <code>http.client_stats.closed_channels.max_age</code> setting will not be
		 * represented here.
		 * <p>
		 * API name: {@code clients}
		 * <p>
		 * Adds a value to <code>clients</code> using a builder lambda.
		 */
		public final Builder clients(Function<Client.Builder, ObjectBuilder<Client>> fn) {
			return clients(fn.apply(new Client.Builder()).build());
		}

		/**
		 * Required - Detailed HTTP stats broken down by route
		 * <p>
		 * API name: {@code routes}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>routes</code>.
		 */
		public final Builder routes(Map<String, HttpRoute> map) {
			this.routes = _mapPutAll(this.routes, map);
			return this;
		}

		/**
		 * Required - Detailed HTTP stats broken down by route
		 * <p>
		 * API name: {@code routes}
		 * <p>
		 * Adds an entry to <code>routes</code>.
		 */
		public final Builder routes(String key, HttpRoute value) {
			this.routes = _mapPut(this.routes, key, value);
			return this;
		}

		/**
		 * Required - Detailed HTTP stats broken down by route
		 * <p>
		 * API name: {@code routes}
		 * <p>
		 * Adds an entry to <code>routes</code> using a builder lambda.
		 */
		public final Builder routes(String key, Function<HttpRoute.Builder, ObjectBuilder<HttpRoute>> fn) {
			return routes(key, fn.apply(new HttpRoute.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Http}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Http build() {
			_checkSingleUse();

			return new Http(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Http}
	 */
	public static final JsonpDeserializer<Http> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Http::setupHttpDeserializer);

	protected static void setupHttpDeserializer(ObjectDeserializer<Http.Builder> op) {

		op.add(Builder::currentOpen, JsonpDeserializer.integerDeserializer(), "current_open");
		op.add(Builder::totalOpened, JsonpDeserializer.longDeserializer(), "total_opened");
		op.add(Builder::clients, JsonpDeserializer.arrayDeserializer(Client._DESERIALIZER), "clients");
		op.add(Builder::routes, JsonpDeserializer.stringMapDeserializer(HttpRoute._DESERIALIZER), "routes");

	}

}
