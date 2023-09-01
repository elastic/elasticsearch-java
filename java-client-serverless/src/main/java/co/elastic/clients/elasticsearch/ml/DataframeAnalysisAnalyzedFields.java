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

package co.elastic.clients.elasticsearch.ml;

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
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysisAnalyzedFields

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeAnalysisAnalyzedFields">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalysisAnalyzedFields implements JsonpSerializable {
	private final List<String> includes;

	private final List<String> excludes;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalysisAnalyzedFields(Builder builder) {

		this.includes = ApiTypeHelper.unmodifiableRequired(builder.includes, this, "includes");
		this.excludes = ApiTypeHelper.unmodifiableRequired(builder.excludes, this, "excludes");

	}

	public static DataframeAnalysisAnalyzedFields of(
			Function<Builder, ObjectBuilder<DataframeAnalysisAnalyzedFields>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - An array of strings that defines the fields that will be excluded
	 * from the analysis. You do not need to add fields with unsupported data types
	 * to excludes, these fields are excluded from the analysis automatically.
	 * <p>
	 * API name: {@code includes}
	 */
	public final List<String> includes() {
		return this.includes;
	}

	/**
	 * Required - An array of strings that defines the fields that will be included
	 * in the analysis.
	 * <p>
	 * API name: {@code excludes}
	 */
	public final List<String> excludes() {
		return this.excludes;
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

		if (ApiTypeHelper.isDefined(this.includes)) {
			generator.writeKey("includes");
			generator.writeStartArray();
			for (String item0 : this.includes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ApiTypeHelper.isDefined(this.excludes)) {
			generator.writeKey("excludes");
			generator.writeStartArray();
			for (String item0 : this.excludes) {
				generator.write(item0);

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
	 * Builder for {@link DataframeAnalysisAnalyzedFields}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeAnalysisAnalyzedFields> {
		private List<String> includes;

		private List<String> excludes;

		/**
		 * Required - An array of strings that defines the fields that will be excluded
		 * from the analysis. You do not need to add fields with unsupported data types
		 * to excludes, these fields are excluded from the analysis automatically.
		 * <p>
		 * API name: {@code includes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>includes</code>.
		 */
		public final Builder includes(List<String> list) {
			this.includes = _listAddAll(this.includes, list);
			return this;
		}

		/**
		 * Required - An array of strings that defines the fields that will be excluded
		 * from the analysis. You do not need to add fields with unsupported data types
		 * to excludes, these fields are excluded from the analysis automatically.
		 * <p>
		 * API name: {@code includes}
		 * <p>
		 * Adds one or more values to <code>includes</code>.
		 */
		public final Builder includes(String value, String... values) {
			this.includes = _listAdd(this.includes, value, values);
			return this;
		}

		/**
		 * Required - An array of strings that defines the fields that will be included
		 * in the analysis.
		 * <p>
		 * API name: {@code excludes}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>excludes</code>.
		 */
		public final Builder excludes(List<String> list) {
			this.excludes = _listAddAll(this.excludes, list);
			return this;
		}

		/**
		 * Required - An array of strings that defines the fields that will be included
		 * in the analysis.
		 * <p>
		 * API name: {@code excludes}
		 * <p>
		 * Adds one or more values to <code>excludes</code>.
		 */
		public final Builder excludes(String value, String... values) {
			this.excludes = _listAdd(this.excludes, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalysisAnalyzedFields}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalysisAnalyzedFields build() {
			_checkSingleUse();

			return new DataframeAnalysisAnalyzedFields(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalysisAnalyzedFields}
	 */
	public static final JsonpDeserializer<DataframeAnalysisAnalyzedFields> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DataframeAnalysisAnalyzedFields::setupDataframeAnalysisAnalyzedFieldsDeserializer);

	protected static void setupDataframeAnalysisAnalyzedFieldsDeserializer(
			ObjectDeserializer<DataframeAnalysisAnalyzedFields.Builder> op) {

		op.add(Builder::includes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"includes");
		op.add(Builder::excludes, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"excludes");

		op.shortcutProperty("includes");

	}

}
