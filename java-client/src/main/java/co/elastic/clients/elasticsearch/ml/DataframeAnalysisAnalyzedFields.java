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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysisAnalyzedFields
@JsonpDeserializable
public class DataframeAnalysisAnalyzedFields implements JsonpSerializable {
	private final List<String> includes;

	private final List<String> excludes;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalysisAnalyzedFields(Builder builder) {

		this.includes = ModelTypeHelper.unmodifiableRequired(builder.includes, this, "includes");
		this.excludes = ModelTypeHelper.unmodifiableRequired(builder.excludes, this, "excludes");

	}

	public static DataframeAnalysisAnalyzedFields of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
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

		if (ModelTypeHelper.isDefined(this.includes)) {
			generator.writeKey("includes");
			generator.writeStartArray();
			for (String item0 : this.includes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.excludes)) {
			generator.writeKey("excludes");
			generator.writeStartArray();
			for (String item0 : this.excludes) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalysisAnalyzedFields}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<DataframeAnalysisAnalyzedFields> {
		private List<String> includes;

		private List<String> excludes;

		/**
		 * Required - An array of strings that defines the fields that will be excluded
		 * from the analysis. You do not need to add fields with unsupported data types
		 * to excludes, these fields are excluded from the analysis automatically.
		 * <p>
		 * API name: {@code includes}
		 */
		public final Builder includes(List<String> value) {
			this.includes = value;
			return this;
		}

		/**
		 * Required - An array of strings that defines the fields that will be excluded
		 * from the analysis. You do not need to add fields with unsupported data types
		 * to excludes, these fields are excluded from the analysis automatically.
		 * <p>
		 * API name: {@code includes}
		 */
		public final Builder includes(String... value) {
			this.includes = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - An array of strings that defines the fields that will be included
		 * in the analysis.
		 * <p>
		 * API name: {@code excludes}
		 */
		public final Builder excludes(List<String> value) {
			this.excludes = value;
			return this;
		}

		/**
		 * Required - An array of strings that defines the fields that will be included
		 * in the analysis.
		 * <p>
		 * API name: {@code excludes}
		 */
		public final Builder excludes(String... value) {
			this.excludes = Arrays.asList(value);
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
