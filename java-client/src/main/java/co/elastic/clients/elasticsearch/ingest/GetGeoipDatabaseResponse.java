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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.elasticsearch.ingest.get_geoip_database.DatabaseConfigurationMetadata;
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
import java.util.List;
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

// typedef: ingest.get_geoip_database.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ingest.get_geoip_database.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetGeoipDatabaseResponse implements JsonpSerializable {
	private final List<DatabaseConfigurationMetadata> databases;

	// ---------------------------------------------------------------------------------------------

	private GetGeoipDatabaseResponse(Builder builder) {

		this.databases = ApiTypeHelper.unmodifiableRequired(builder.databases, this, "databases");

	}

	public static GetGeoipDatabaseResponse of(Function<Builder, ObjectBuilder<GetGeoipDatabaseResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code databases}
	 */
	public final List<DatabaseConfigurationMetadata> databases() {
		return this.databases;
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

		if (ApiTypeHelper.isDefined(this.databases)) {
			generator.writeKey("databases");
			generator.writeStartArray();
			for (DatabaseConfigurationMetadata item0 : this.databases) {
				item0.serialize(generator, mapper);

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
	 * Builder for {@link GetGeoipDatabaseResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetGeoipDatabaseResponse> {
		private List<DatabaseConfigurationMetadata> databases;

		/**
		 * Required - API name: {@code databases}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>databases</code>.
		 */
		public final Builder databases(List<DatabaseConfigurationMetadata> list) {
			this.databases = _listAddAll(this.databases, list);
			return this;
		}

		/**
		 * Required - API name: {@code databases}
		 * <p>
		 * Adds one or more values to <code>databases</code>.
		 */
		public final Builder databases(DatabaseConfigurationMetadata value, DatabaseConfigurationMetadata... values) {
			this.databases = _listAdd(this.databases, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code databases}
		 * <p>
		 * Adds a value to <code>databases</code> using a builder lambda.
		 */
		public final Builder databases(
				Function<DatabaseConfigurationMetadata.Builder, ObjectBuilder<DatabaseConfigurationMetadata>> fn) {
			return databases(fn.apply(new DatabaseConfigurationMetadata.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetGeoipDatabaseResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetGeoipDatabaseResponse build() {
			_checkSingleUse();

			return new GetGeoipDatabaseResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetGeoipDatabaseResponse}
	 */
	public static final JsonpDeserializer<GetGeoipDatabaseResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetGeoipDatabaseResponse::setupGetGeoipDatabaseResponseDeserializer);

	protected static void setupGetGeoipDatabaseResponseDeserializer(
			ObjectDeserializer<GetGeoipDatabaseResponse.Builder> op) {

		op.add(Builder::databases, JsonpDeserializer.arrayDeserializer(DatabaseConfigurationMetadata._DESERIALIZER),
				"databases");

	}

}
