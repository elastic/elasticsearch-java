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

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.InstanceDeserializer;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Number;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

// typedef: ml._types.DataframeAnalysisFeatureProcessorMultiEncoding
public final class DataframeAnalysisFeatureProcessorMultiEncoding
		implements
			DataframeAnalysisFeatureProcessor,
			JsonpSerializable {
	private final List<Number> processors;

	// ---------------------------------------------------------------------------------------------

	public DataframeAnalysisFeatureProcessorMultiEncoding(Builder builder) {

		this.processors = Objects.requireNonNull(builder.processors, "processors");

	}

	/**
	 * {@link DataframeAnalysisFeatureProcessor} variant type
	 */
	@Override
	public String _type() {
		return "multi_encoding";
	}

	/**
	 * The ordered array of custom processors to execute. Must be more than 1.
	 * <p>
	 * API name: {@code processors}
	 */
	public List<Number> processors() {
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
		generator.writeStartObject(_type());

		generator.writeKey("processors");
		generator.writeStartArray();
		for (Number item0 : this.processors) {
			generator.write(item0.doubleValue());

		}
		generator.writeEnd();

		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DataframeAnalysisFeatureProcessorMultiEncoding}.
	 */
	public static class Builder implements ObjectBuilder<DataframeAnalysisFeatureProcessorMultiEncoding> {
		private List<Number> processors;

		/**
		 * The ordered array of custom processors to execute. Must be more than 1.
		 * <p>
		 * API name: {@code processors}
		 */
		public Builder processors(List<Number> value) {
			this.processors = value;
			return this;
		}

		/**
		 * The ordered array of custom processors to execute. Must be more than 1.
		 * <p>
		 * API name: {@code processors}
		 */
		public Builder processors(Number... value) {
			this.processors = Arrays.asList(value);
			return this;
		}

		/**
		 * Add a value to {@link #processors(List)}, creating the list if needed.
		 */
		public Builder addProcessors(Number value) {
			if (this.processors == null) {
				this.processors = new ArrayList<>();
			}
			this.processors.add(value);
			return this;
		}

		/**
		 * Builds a {@link DataframeAnalysisFeatureProcessorMultiEncoding}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DataframeAnalysisFeatureProcessorMultiEncoding build() {

			return new DataframeAnalysisFeatureProcessorMultiEncoding(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	// Internal - Deserializer for variant builder
	public static final InstanceDeserializer<DataframeAnalysisFeatureProcessorMultiEncoding.Builder, DataframeAnalysisFeatureProcessorMultiEncoding.Builder> $BUILDER_DESERIALIZER = ObjectBuilderDeserializer
			.createForBuilder(
					DataframeAnalysisFeatureProcessorMultiEncoding::setupDataframeAnalysisFeatureProcessorMultiEncodingDeserializer);

	protected static void setupDataframeAnalysisFeatureProcessorMultiEncodingDeserializer(
			DelegatingDeserializer<DataframeAnalysisFeatureProcessorMultiEncoding.Builder> op) {

		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.numberDeserializer()),
				"processors");

	}

}
