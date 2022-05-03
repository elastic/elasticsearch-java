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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.DateTime;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.IndexSettingsTimeSeries

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.IndexSettingsTimeSeries">API
 *      specification</a>
 */
@JsonpDeserializable
public class IndexSettingsTimeSeries implements JsonpSerializable {
	@Nullable
	private final DateTime endTime;

	@Nullable
	private final DateTime startTime;

	// ---------------------------------------------------------------------------------------------

	private IndexSettingsTimeSeries(Builder builder) {

		this.endTime = builder.endTime;
		this.startTime = builder.startTime;

	}

	public static IndexSettingsTimeSeries of(Function<Builder, ObjectBuilder<IndexSettingsTimeSeries>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code end_time}
	 */
	@Nullable
	public final DateTime endTime() {
		return this.endTime;
	}

	/**
	 * API name: {@code start_time}
	 */
	@Nullable
	public final DateTime startTime() {
		return this.startTime;
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

		if (this.endTime != null) {
			generator.writeKey("end_time");
			this.endTime.serialize(generator, mapper);
		}
		if (this.startTime != null) {
			generator.writeKey("start_time");
			this.startTime.serialize(generator, mapper);
		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IndexSettingsTimeSeries}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IndexSettingsTimeSeries> {
		@Nullable
		private DateTime endTime;

		@Nullable
		private DateTime startTime;

		/**
		 * API name: {@code end_time}
		 */
		public final Builder endTime(@Nullable DateTime value) {
			this.endTime = value;
			return this;
		}

		/**
		 * API name: {@code start_time}
		 */
		public final Builder startTime(@Nullable DateTime value) {
			this.startTime = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IndexSettingsTimeSeries}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IndexSettingsTimeSeries build() {
			_checkSingleUse();

			return new IndexSettingsTimeSeries(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IndexSettingsTimeSeries}
	 */
	public static final JsonpDeserializer<IndexSettingsTimeSeries> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IndexSettingsTimeSeries::setupIndexSettingsTimeSeriesDeserializer);

	protected static void setupIndexSettingsTimeSeriesDeserializer(
			ObjectDeserializer<IndexSettingsTimeSeries.Builder> op) {

		op.add(Builder::endTime, DateTime._DESERIALIZER, "end_time");
		op.add(Builder::startTime, DateTime._DESERIALIZER, "start_time");

	}

}
