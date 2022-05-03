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
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysisFeatureProcessorMultiEncoding

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ml._types.DataframeAnalysisFeatureProcessorMultiEncoding">API
 *      specification</a>
 */
@JsonpDeserializable
public class DataframeAnalysisFeatureProcessorMultiEncoding
		implements
			DataframeAnalysisFeatureProcessorVariant,
			JsonpSerializable {
	private final List<Integer> processors;

	// ---------------------------------------------------------------------------------------------

	private DataframeAnalysisFeatureProcessorMultiEncoding(Builder builder) {

		this.processors = ApiTypeHelper.unmodifiableRequired(builder.processors, this, "processors");

	}

	public static DataframeAnalysisFeatureProcessorMultiEncoding of(
			Function<Builder, ObjectBuilder<DataframeAnalysisFeatureProcessorMultiEncoding>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * DataframeAnalysisFeatureProcessor variant kind.
	 */
	@Override
	public DataframeAnalysisFeatureProcessor.Kind _dataframeAnalysisFeatureProcessorKind() {
		return DataframeAnalysisFeatureProcessor.Kind.MultiEncoding;
	}

	/**
	 * Required - The ordered array of custom processors to execute. Must be more
	 * than 1.
	 * <p>
	 * API name: {@code processors}
	 */
	public final List<Integer> processors() {
		return this.processors;
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

		if (ApiTypeHelper.isDefined(this.processors)) {
			generator.writeKey("processors");
			generator.writeStartArray();
			for (Integer item0 : this.processors) {
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
	 * Builder for {@link DataframeAnalysisFeatureProcessorMultiEncoding}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DataframeAnalysisFeatureProcessorMultiEncoding> {
		private List<Integer> processors;

		/**
		 * Required - The ordered array of custom processors to execute. Must be more
		 * than 1.
		 * <p>
		 * API name: {@code processors}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>processors</code>.
		 */
		public final Builder processors(List<Integer> list) {
			this.processors = _listAddAll(this.processors, list);
			return this;
		}

		/**
		 * Required - The ordered array of custom processors to execute. Must be more
		 * than 1.
		 * <p>
		 * API name: {@code processors}
		 * <p>
		 * Adds one or more values to <code>processors</code>.
		 */
		public final Builder processors(Integer value, Integer... values) {
			this.processors = _listAdd(this.processors, value, values);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalysisFeatureProcessorMultiEncoding}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalysisFeatureProcessorMultiEncoding build() {
			_checkSingleUse();

			return new DataframeAnalysisFeatureProcessorMultiEncoding(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DataframeAnalysisFeatureProcessorMultiEncoding}
	 */
	public static final JsonpDeserializer<DataframeAnalysisFeatureProcessorMultiEncoding> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new,
					DataframeAnalysisFeatureProcessorMultiEncoding::setupDataframeAnalysisFeatureProcessorMultiEncodingDeserializer);

	protected static void setupDataframeAnalysisFeatureProcessorMultiEncodingDeserializer(
			ObjectDeserializer<DataframeAnalysisFeatureProcessorMultiEncoding.Builder> op) {

		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.integerDeserializer()),
				"processors");

	}

}
