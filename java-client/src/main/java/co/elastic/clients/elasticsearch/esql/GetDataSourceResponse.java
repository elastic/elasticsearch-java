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

// typedef: esql.get_data_source.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#esql.get_data_source.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetDataSourceResponse implements JsonpSerializable {
	private final List<ESQLDataSource> dataSources;

	// ---------------------------------------------------------------------------------------------

	private GetDataSourceResponse(Builder builder) {

		this.dataSources = ApiTypeHelper.unmodifiableRequired(builder.dataSources, this, "dataSources");

	}

	public static GetDataSourceResponse of(Function<Builder, ObjectBuilder<GetDataSourceResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The matching data sources. Credential values in each data source's
	 * settings are redacted as <code>::es_redacted::</code> in the response.
	 * <p>
	 * API name: {@code data_sources}
	 */
	public final List<ESQLDataSource> dataSources() {
		return this.dataSources;
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

		if (ApiTypeHelper.isDefined(this.dataSources)) {
			generator.writeKey("data_sources");
			generator.writeStartArray();
			for (ESQLDataSource item0 : this.dataSources) {
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
	 * Builder for {@link GetDataSourceResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetDataSourceResponse> {
		private List<ESQLDataSource> dataSources;

		/**
		 * Required - The matching data sources. Credential values in each data source's
		 * settings are redacted as <code>::es_redacted::</code> in the response.
		 * <p>
		 * API name: {@code data_sources}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>dataSources</code>.
		 */
		public final Builder dataSources(List<ESQLDataSource> list) {
			this.dataSources = _listAddAll(this.dataSources, list);
			return this;
		}

		/**
		 * Required - The matching data sources. Credential values in each data source's
		 * settings are redacted as <code>::es_redacted::</code> in the response.
		 * <p>
		 * API name: {@code data_sources}
		 * <p>
		 * Adds one or more values to <code>dataSources</code>.
		 */
		public final Builder dataSources(ESQLDataSource value, ESQLDataSource... values) {
			this.dataSources = _listAdd(this.dataSources, value, values);
			return this;
		}

		/**
		 * Required - The matching data sources. Credential values in each data source's
		 * settings are redacted as <code>::es_redacted::</code> in the response.
		 * <p>
		 * API name: {@code data_sources}
		 * <p>
		 * Adds a value to <code>dataSources</code> using a builder lambda.
		 */
		public final Builder dataSources(Function<ESQLDataSource.Builder, ObjectBuilder<ESQLDataSource>> fn) {
			return dataSources(fn.apply(new ESQLDataSource.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetDataSourceResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDataSourceResponse build() {
			_checkSingleUse();

			return new GetDataSourceResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetDataSourceResponse}
	 */
	public static final JsonpDeserializer<GetDataSourceResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetDataSourceResponse::setupGetDataSourceResponseDeserializer);

	protected static void setupGetDataSourceResponseDeserializer(ObjectDeserializer<GetDataSourceResponse.Builder> op) {

		op.add(Builder::dataSources, JsonpDeserializer.arrayDeserializer(ESQLDataSource._DESERIALIZER), "data_sources");

	}

}
