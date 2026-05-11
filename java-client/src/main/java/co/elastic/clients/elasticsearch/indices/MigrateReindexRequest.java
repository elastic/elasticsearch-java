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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch.indices.migrate_reindex.MigrateReindex;
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
import jakarta.json.stream.JsonParser;
import java.util.Collections;
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

// typedef: indices.migrate_reindex.Request

/**
 * Reindex legacy backing indices.
 * <p>
 * Reindex all legacy backing indices for a data stream. This operation occurs
 * in a persistent task. The persistent task ID is returned immediately and the
 * reindexing work is completed in that task.
 * 
 * @see <a href="../doc-files/api-spec.html#indices.migrate_reindex.Request">API
 *      specification</a>
 */
@JsonpDeserializable
public class MigrateReindexRequest extends RequestBase implements JsonpSerializable {
	private final MigrateReindex reindex;

	// ---------------------------------------------------------------------------------------------

	private MigrateReindexRequest(Builder builder) {

		this.reindex = ApiTypeHelper.requireNonNull(builder.reindex, this, "reindex");

	}

	public static MigrateReindexRequest of(Function<Builder, ObjectBuilder<MigrateReindexRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Request body.
	 */
	public final MigrateReindex reindex() {
		return this.reindex;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		this.reindex.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MigrateReindexRequest}.
	 */

	public static class Builder extends RequestBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<MigrateReindexRequest> {
		private MigrateReindex reindex;

		public Builder() {
		}
		private Builder(MigrateReindexRequest instance) {
			this.reindex = instance.reindex;

		}
		/**
		 * Required - Request body.
		 */
		public final Builder reindex(MigrateReindex value) {
			this.reindex = value;
			return this;
		}

		/**
		 * Required - Request body.
		 */
		public final Builder reindex(Function<MigrateReindex.Builder, ObjectBuilder<MigrateReindex>> fn) {
			return this.reindex(fn.apply(new MigrateReindex.Builder()).build());
		}

		@Override
		public Builder withJson(JsonParser parser, JsonpMapper mapper) {

			@SuppressWarnings("unchecked")
			MigrateReindex value = (MigrateReindex) MigrateReindex._DESERIALIZER.deserialize(parser, mapper);
			return this.reindex(value);
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MigrateReindexRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MigrateReindexRequest build() {
			_checkSingleUse();

			return new MigrateReindexRequest(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	public static final JsonpDeserializer<MigrateReindexRequest> _DESERIALIZER = createMigrateReindexRequestDeserializer();
	protected static JsonpDeserializer<MigrateReindexRequest> createMigrateReindexRequestDeserializer() {

		JsonpDeserializer<MigrateReindex> valueDeserializer = MigrateReindex._DESERIALIZER;

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.reindex(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code indices.migrate_reindex}".
	 */
	public static final Endpoint<MigrateReindexRequest, MigrateReindexResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			"es/indices.migrate_reindex",

			// Request method
			request -> {
				return "POST";

			},

			// Request path
			request -> {
				return "/_migration/reindex";

			},

			// Path parameters
			request -> {
				return Collections.emptyMap();
			},

			// Request parameters
			request -> {
				return Collections.emptyMap();

			}, SimpleEndpoint.emptyMap(), true, MigrateReindexResponse._DESERIALIZER);
}
