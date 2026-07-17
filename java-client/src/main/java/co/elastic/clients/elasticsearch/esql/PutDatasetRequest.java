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

package co.elastic.clients.elasticsearch.esql;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.endpoints.SimpleEndpoint;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.HashMap;
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

// typedef: esql.put_dataset.Request

/**
 * Create or replace an ES|QL dataset.
 * <p>
 * Creates or replaces a dataset that references a data source. Dataset names
 * participate in the index namespace and must follow index/alias naming rules.
 * Returns <code>404</code> if the referenced data source does not exist.
 * 
 * @see <a href="../doc-files/api-spec.html#esql.put_dataset.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class PutDatasetRequest extends RequestBase implements JsonpSerializable {
	private final String dataSource;

	@Nullable
	private final String description;

	@Nullable
	private final DatasetMapping mappings;

	@Nullable
	private final Time masterTimeout;

	private final String name;

	private final String resource;

	private final Map<String, JsonData> settings;

	@Nullable
	private final Time timeout;

	// ---------------------------------------------------------------------------------------------

	private PutDatasetRequest(Builder builder) {

		this.dataSource = ApiTypeHelper.requireNonNull(builder.dataSource, this, "dataSource");
		this.description = builder.description;
		this.mappings = builder.mappings;
		this.masterTimeout = builder.masterTimeout;
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.resource = ApiTypeHelper.requireNonNull(builder.resource, this, "resource");
		this.settings = ApiTypeHelper.unmodifiable(builder.settings);
		this.timeout = builder.timeout;

	}

	public static PutDatasetRequest of(Function<Builder, ObjectBuilder<PutDatasetRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The name of the referenced data source. The data source must
	 * already exist.
	 * <p>
	 * API name: {@code data_source}
	 */
	public final String dataSource() {
		return this.dataSource;
	}

	/**
	 * A free-text description of the dataset.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * User-declared mapping on the dataset definition
	 * <p>
	 * API name: {@code mappings}
	 */
	@Nullable
	public final DatasetMapping mappings() {
		return this.mappings;
	}

	/**
	 * Period to wait for a connection to the master node.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * Required - The dataset name to create or update.
	 * <p>
	 * API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - The URI that identifies the data to read, resolved against the
	 * referenced data source, rather than only a path. For S3, it can include glob
	 * patterns, for example a recursive <code>/**</code> matching
	 * <code>*.parquet</code> files under a prefix such as
	 * <code>s3://bucket/logs</code>.
	 * <p>
	 * API name: {@code resource}
	 */
	public final String resource() {
		return this.resource;
	}

	/**
	 * Format and parsing-specific settings that configure how the resource is read.
	 * The accepted keys depend on the format reader; compression can be inferred
	 * from the resource URI.
	 * <p>
	 * API name: {@code settings}
	 */
	public final Map<String, JsonData> settings() {
		return this.settings;
	}

	/**
	 * The time to wait for the request to be completed.
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
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

		generator.writeKey("data_source");
		generator.write(this.dataSource);

		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.mappings != null) {
			generator.writeKey("mappings");
			this.mappings.serialize(generator, mapper);

		}
		generator.writeKey("resource");
		generator.write(this.resource);

		if (ApiTypeHelper.isDefined(this.settings)) {
			generator.writeKey("settings");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.settings.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutDatasetRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<PutDatasetRequest> {
		private String dataSource;

		@Nullable
		private String description;

		@Nullable
		private DatasetMapping mappings;

		@Nullable
		private Time masterTimeout;

		private String name;

		private String resource;

		@Nullable
		private Map<String, JsonData> settings;

		@Nullable
		private Time timeout;

		public Builder() {
		}
		private Builder(PutDatasetRequest instance) {
			this.dataSource = instance.dataSource;
			this.description = instance.description;
			this.mappings = instance.mappings;
			this.masterTimeout = instance.masterTimeout;
			this.name = instance.name;
			this.resource = instance.resource;
			this.settings = instance.settings;
			this.timeout = instance.timeout;

		}
		/**
		 * Required - The name of the referenced data source. The data source must
		 * already exist.
		 * <p>
		 * API name: {@code data_source}
		 */
		public final Builder dataSource(String value) {
			this.dataSource = value;
			return this;
		}

		/**
		 * A free-text description of the dataset.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * User-declared mapping on the dataset definition
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(@Nullable DatasetMapping value) {
			this.mappings = value;
			return this;
		}

		/**
		 * User-declared mapping on the dataset definition
		 * <p>
		 * API name: {@code mappings}
		 */
		public final Builder mappings(Function<DatasetMapping.Builder, ObjectBuilder<DatasetMapping>> fn) {
			return this.mappings(fn.apply(new DatasetMapping.Builder()).build());
		}

		/**
		 * Period to wait for a connection to the master node.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Required - The dataset name to create or update.
		 * <p>
		 * API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - The URI that identifies the data to read, resolved against the
		 * referenced data source, rather than only a path. For S3, it can include glob
		 * patterns, for example a recursive <code>/**</code> matching
		 * <code>*.parquet</code> files under a prefix such as
		 * <code>s3://bucket/logs</code>.
		 * <p>
		 * API name: {@code resource}
		 */
		public final Builder resource(String value) {
			this.resource = value;
			return this;
		}

		/**
		 * Format and parsing-specific settings that configure how the resource is read.
		 * The accepted keys depend on the format reader; compression can be inferred
		 * from the resource URI.
		 * <p>
		 * API name: {@code settings}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>settings</code>.
		 */
		public final Builder settings(Map<String, JsonData> map) {
			this.settings = _mapPutAll(this.settings, map);
			return this;
		}

		/**
		 * Format and parsing-specific settings that configure how the resource is read.
		 * The accepted keys depend on the format reader; compression can be inferred
		 * from the resource URI.
		 * <p>
		 * API name: {@code settings}
		 * <p>
		 * Adds an entry to <code>settings</code>.
		 */
		public final Builder settings(String key, JsonData value) {
			this.settings = _mapPut(this.settings, key, value);
			return this;
		}

		/**
		 * The time to wait for the request to be completed.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * The time to wait for the request to be completed.
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link PutDatasetRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutDatasetRequest build() {
			_checkSingleUse();

			return new PutDatasetRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutDatasetRequest}
	 */
	public static final JsonpDeserializer<PutDatasetRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutDatasetRequest::setupPutDatasetRequestDeserializer);

	protected static void setupPutDatasetRequestDeserializer(ObjectDeserializer<PutDatasetRequest.Builder> op) {

		op.add(Builder::dataSource, JsonpDeserializer.stringDeserializer(), "data_source");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::mappings, DatasetMapping._DESERIALIZER, "mappings");
		op.add(Builder::resource, JsonpDeserializer.stringDeserializer(), "resource");
		op.add(Builder::settings, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "settings");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code esql.put_dataset}".
	 */
	public static final Endpoint<PutDatasetRequest, PutDatasetResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/esql.put_dataset",

			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_query");
					buf.append("/dataset");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.name, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Path parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				final int _name = 1 << 0;

				int propsSet = 0;

				propsSet |= _name;

				if (propsSet == (_name)) {
					params.put("name", request.name);
				}
				return params;
			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutDatasetResponse._DESERIALIZER);
}
