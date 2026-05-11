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

package co.elastic.clients.elasticsearch._types.aggregations;

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
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
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

// typedef: _types.aggregations.MatrixAggregation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_types.aggregations.MatrixAggregation">API
 *      specification</a>
 */

public abstract class MatrixAggregation extends AggregationBase implements JsonpSerializable {
	private final List<String> fields;

	private final Map<String, Double> missing;

	// ---------------------------------------------------------------------------------------------

	protected MatrixAggregation(AbstractBuilder<?> builder) {

		this.fields = ApiTypeHelper.unmodifiable(builder.fields);
		this.missing = ApiTypeHelper.unmodifiable(builder.missing);

	}

	/**
	 * An array of fields for computing the statistics.
	 * <p>
	 * API name: {@code fields}
	 */
	public final List<String> fields() {
		return this.fields;
	}

	/**
	 * The value to apply to documents that do not have a value. By default,
	 * documents without a value are ignored.
	 * <p>
	 * API name: {@code missing}
	 */
	public final Map<String, Double> missing() {
		return this.missing;
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

		if (ApiTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartArray();
			for (String item0 : this.fields) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.missing)) {
			generator.writeKey("missing");
			generator.writeStartObject();
			for (Map.Entry<String, Double> item0 : this.missing.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public abstract static class AbstractBuilder<BuilderT extends AbstractBuilder<BuilderT>>
			extends
				AggregationBase.AbstractBuilder<BuilderT> {
		@Nullable
		private List<String> fields;

		@Nullable
		private Map<String, Double> missing;

		/**
		 * An array of fields for computing the statistics.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>fields</code>.
		 */
		public final BuilderT fields(List<String> list) {
			this.fields = _listAddAll(this.fields, list);
			return self();
		}

		/**
		 * An array of fields for computing the statistics.
		 * <p>
		 * API name: {@code fields}
		 * <p>
		 * Adds one or more values to <code>fields</code>.
		 */
		public final BuilderT fields(String value, String... values) {
			this.fields = _listAdd(this.fields, value, values);
			return self();
		}

		/**
		 * The value to apply to documents that do not have a value. By default,
		 * documents without a value are ignored.
		 * <p>
		 * API name: {@code missing}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>missing</code>.
		 */
		public final BuilderT missing(Map<String, Double> map) {
			this.missing = _mapPutAll(this.missing, map);
			return self();
		}

		/**
		 * The value to apply to documents that do not have a value. By default,
		 * documents without a value are ignored.
		 * <p>
		 * API name: {@code missing}
		 * <p>
		 * Adds an entry to <code>missing</code>.
		 */
		public final BuilderT missing(String key, Double value) {
			this.missing = _mapPut(this.missing, key, value);
			return self();
		}

		protected abstract BuilderT self();

	}

	// ---------------------------------------------------------------------------------------------
	protected static <BuilderT extends AbstractBuilder<BuilderT>> void setupMatrixAggregationDeserializer(
			ObjectDeserializer<BuilderT> op) {

		op.add(AbstractBuilder::fields, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"fields");
		op.add(AbstractBuilder::missing,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.doubleDeserializer()), "missing");

	}

}
