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
import co.elastic.clients.util.ListBuilder;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml.explain_data_frame_analytics.Response
@JsonpDeserializable
public class ExplainDataFrameAnalyticsResponse implements JsonpSerializable {
	private final List<DataframeAnalyticsFieldSelection> fieldSelection;

	private final DataframeAnalyticsMemoryEstimation memoryEstimation;

	// ---------------------------------------------------------------------------------------------

	private ExplainDataFrameAnalyticsResponse(Builder builder) {

		this.fieldSelection = ModelTypeHelper.unmodifiableRequired(builder.fieldSelection, this, "fieldSelection");
		this.memoryEstimation = ModelTypeHelper.requireNonNull(builder.memoryEstimation, this, "memoryEstimation");

	}

	public static ExplainDataFrameAnalyticsResponse of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
	}

	/**
	 * Required - An array of objects that explain selection for each field, sorted
	 * by the field names.
	 * <p>
	 * API name: {@code field_selection}
	 */
	public final List<DataframeAnalyticsFieldSelection> fieldSelection() {
		return this.fieldSelection;
	}

	/**
	 * Required - An array of objects that explain selection for each field, sorted
	 * by the field names.
	 * <p>
	 * API name: {@code memory_estimation}
	 */
	public final DataframeAnalyticsMemoryEstimation memoryEstimation() {
		return this.memoryEstimation;
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

		if (ModelTypeHelper.isDefined(this.fieldSelection)) {
			generator.writeKey("field_selection");
			generator.writeStartArray();
			for (DataframeAnalyticsFieldSelection item0 : this.fieldSelection) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("memory_estimation");
		this.memoryEstimation.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ExplainDataFrameAnalyticsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<ExplainDataFrameAnalyticsResponse> {
		private List<DataframeAnalyticsFieldSelection> fieldSelection;

		private DataframeAnalyticsMemoryEstimation memoryEstimation;

		/**
		 * Required - An array of objects that explain selection for each field, sorted
		 * by the field names.
		 * <p>
		 * API name: {@code field_selection}
		 */
		public final Builder fieldSelection(List<DataframeAnalyticsFieldSelection> value) {
			this.fieldSelection = value;
			return this;
		}

		/**
		 * Required - An array of objects that explain selection for each field, sorted
		 * by the field names.
		 * <p>
		 * API name: {@code field_selection}
		 */
		public final Builder fieldSelection(DataframeAnalyticsFieldSelection... value) {
			this.fieldSelection = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - An array of objects that explain selection for each field, sorted
		 * by the field names.
		 * <p>
		 * API name: {@code field_selection}
		 */
		public final Builder fieldSelection(
				Function<ListBuilder<DataframeAnalyticsFieldSelection, DataframeAnalyticsFieldSelection.Builder>, ObjectBuilder<List<DataframeAnalyticsFieldSelection>>> fn) {
			return fieldSelection(fn.apply(new ListBuilder<>(DataframeAnalyticsFieldSelection.Builder::new)).build());
		}

		/**
		 * Required - An array of objects that explain selection for each field, sorted
		 * by the field names.
		 * <p>
		 * API name: {@code memory_estimation}
		 */
		public final Builder memoryEstimation(DataframeAnalyticsMemoryEstimation value) {
			this.memoryEstimation = value;
			return this;
		}

		/**
		 * Required - An array of objects that explain selection for each field, sorted
		 * by the field names.
		 * <p>
		 * API name: {@code memory_estimation}
		 */
		public final Builder memoryEstimation(Consumer<DataframeAnalyticsMemoryEstimation.Builder> fn) {
			DataframeAnalyticsMemoryEstimation.Builder builder = new DataframeAnalyticsMemoryEstimation.Builder();
			fn.accept(builder);
			return this.memoryEstimation(builder.build());
		}

		/**
		 * Builds a {@link ExplainDataFrameAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ExplainDataFrameAnalyticsResponse build() {
			_checkSingleUse();

			return new ExplainDataFrameAnalyticsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ExplainDataFrameAnalyticsResponse}
	 */
	public static final JsonpDeserializer<ExplainDataFrameAnalyticsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ExplainDataFrameAnalyticsResponse::setupExplainDataFrameAnalyticsResponseDeserializer);

	protected static void setupExplainDataFrameAnalyticsResponseDeserializer(
			ObjectDeserializer<ExplainDataFrameAnalyticsResponse.Builder> op) {

		op.add(Builder::fieldSelection,
				JsonpDeserializer.arrayDeserializer(DataframeAnalyticsFieldSelection._DESERIALIZER), "field_selection");
		op.add(Builder::memoryEstimation, DataframeAnalyticsMemoryEstimation._DESERIALIZER, "memory_estimation");

	}

}
