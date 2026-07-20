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

// typedef: esql.get_dataset.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#esql.get_dataset.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class GetDatasetResponse implements JsonpSerializable {
	private final List<ESQLDataset> datasets;

	// ---------------------------------------------------------------------------------------------

	private GetDatasetResponse(Builder builder) {

		this.datasets = ApiTypeHelper.unmodifiableRequired(builder.datasets, this, "datasets");

	}

	public static GetDatasetResponse of(Function<Builder, ObjectBuilder<GetDatasetResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The matching datasets.
	 * <p>
	 * API name: {@code datasets}
	 */
	public final List<ESQLDataset> datasets() {
		return this.datasets;
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

		if (ApiTypeHelper.isDefined(this.datasets)) {
			generator.writeKey("datasets");
			generator.writeStartArray();
			for (ESQLDataset item0 : this.datasets) {
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
	 * Builder for {@link GetDatasetResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<GetDatasetResponse> {
		private List<ESQLDataset> datasets;

		/**
		 * Required - The matching datasets.
		 * <p>
		 * API name: {@code datasets}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>datasets</code>.
		 */
		public final Builder datasets(List<ESQLDataset> list) {
			this.datasets = _listAddAll(this.datasets, list);
			return this;
		}

		/**
		 * Required - The matching datasets.
		 * <p>
		 * API name: {@code datasets}
		 * <p>
		 * Adds one or more values to <code>datasets</code>.
		 */
		public final Builder datasets(ESQLDataset value, ESQLDataset... values) {
			this.datasets = _listAdd(this.datasets, value, values);
			return this;
		}

		/**
		 * Required - The matching datasets.
		 * <p>
		 * API name: {@code datasets}
		 * <p>
		 * Adds a value to <code>datasets</code> using a builder lambda.
		 */
		public final Builder datasets(Function<ESQLDataset.Builder, ObjectBuilder<ESQLDataset>> fn) {
			return datasets(fn.apply(new ESQLDataset.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link GetDatasetResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public GetDatasetResponse build() {
			_checkSingleUse();

			return new GetDatasetResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link GetDatasetResponse}
	 */
	public static final JsonpDeserializer<GetDatasetResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, GetDatasetResponse::setupGetDatasetResponseDeserializer);

	protected static void setupGetDatasetResponseDeserializer(ObjectDeserializer<GetDatasetResponse.Builder> op) {

		op.add(Builder::datasets, JsonpDeserializer.arrayDeserializer(ESQLDataset._DESERIALIZER), "datasets");

	}

}
