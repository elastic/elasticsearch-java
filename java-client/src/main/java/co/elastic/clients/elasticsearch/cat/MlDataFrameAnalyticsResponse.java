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

package co.elastic.clients.elasticsearch.cat;

import co.elastic.clients.elasticsearch.cat.ml_data_frame_analytics.DataFrameAnalyticsRecord;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cat.ml_data_frame_analytics.Response
@JsonpDeserializable
public class MlDataFrameAnalyticsResponse implements JsonpSerializable {
	private final List<DataFrameAnalyticsRecord> valueBody;

	// ---------------------------------------------------------------------------------------------

	private MlDataFrameAnalyticsResponse(Builder builder) {

		this.valueBody = ModelTypeHelper.unmodifiableRequired(builder.valueBody, this, "valueBody");

	}

	public static MlDataFrameAnalyticsResponse of(Function<Builder, ObjectBuilder<MlDataFrameAnalyticsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Response value.
	 * <p>
	 * API name: {@code _value_body}
	 */
	public final List<DataFrameAnalyticsRecord> valueBody() {
		return this.valueBody;
	}

	/**
	 * Serialize this value to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartArray();
		for (DataFrameAnalyticsRecord item0 : this.valueBody) {
			item0.serialize(generator, mapper);

		}
		generator.writeEnd();

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDataFrameAnalyticsResponse}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<MlDataFrameAnalyticsResponse> {
		private List<DataFrameAnalyticsRecord> valueBody;

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder valueBody(List<DataFrameAnalyticsRecord> value) {
			this.valueBody = value;
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		public final Builder valueBody(DataFrameAnalyticsRecord... value) {
			this.valueBody = Arrays.asList(value);
			return this;
		}

		/**
		 * Required - Response value.
		 * <p>
		 * API name: {@code _value_body}
		 */
		@SafeVarargs
		public final Builder valueBody(
				Function<DataFrameAnalyticsRecord.Builder, ObjectBuilder<DataFrameAnalyticsRecord>>... fns) {
			this.valueBody = new ArrayList<>(fns.length);
			for (Function<DataFrameAnalyticsRecord.Builder, ObjectBuilder<DataFrameAnalyticsRecord>> fn : fns) {
				this.valueBody.add(fn.apply(new DataFrameAnalyticsRecord.Builder()).build());
			}
			return this;
		}

		/**
		 * Builds a {@link MlDataFrameAnalyticsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlDataFrameAnalyticsResponse build() {
			_checkSingleUse();

			return new MlDataFrameAnalyticsResponse(this);
		}
	}

	public static final JsonpDeserializer<MlDataFrameAnalyticsResponse> _DESERIALIZER = createMlDataFrameAnalyticsResponseDeserializer();
	protected static JsonpDeserializer<MlDataFrameAnalyticsResponse> createMlDataFrameAnalyticsResponseDeserializer() {

		JsonpDeserializer<List<DataFrameAnalyticsRecord>> valueDeserializer = JsonpDeserializer
				.arrayDeserializer(DataFrameAnalyticsRecord._DESERIALIZER);

		return JsonpDeserializer.of(valueDeserializer.acceptedEvents(), (parser, mapper, event) -> new Builder()
				.valueBody(valueDeserializer.deserialize(parser, mapper, event)).build());
	}

}
