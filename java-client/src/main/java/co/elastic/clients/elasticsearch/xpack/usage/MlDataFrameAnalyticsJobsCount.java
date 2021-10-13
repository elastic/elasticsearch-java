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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: xpack.usage.MlDataFrameAnalyticsJobsCount
@JsonpDeserializable
public final class MlDataFrameAnalyticsJobsCount implements JsonpSerializable {
	private final long count;

	// ---------------------------------------------------------------------------------------------

	public MlDataFrameAnalyticsJobsCount(Builder builder) {

		this.count = Objects.requireNonNull(builder.count, "count");

	}

	public MlDataFrameAnalyticsJobsCount(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * Required - API name: {@code count}
	 */
	public long count() {
		return this.count;
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

		generator.writeKey("count");
		generator.write(this.count);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlDataFrameAnalyticsJobsCount}.
	 */
	public static class Builder implements ObjectBuilder<MlDataFrameAnalyticsJobsCount> {
		private Long count;

		/**
		 * Required - API name: {@code count}
		 */
		public Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Builds a {@link MlDataFrameAnalyticsJobsCount}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlDataFrameAnalyticsJobsCount build() {

			return new MlDataFrameAnalyticsJobsCount(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlDataFrameAnalyticsJobsCount}
	 */
	public static final JsonpDeserializer<MlDataFrameAnalyticsJobsCount> _DESERIALIZER = ObjectBuilderDeserializer.lazy(
			Builder::new, MlDataFrameAnalyticsJobsCount::setupMlDataFrameAnalyticsJobsCountDeserializer,
			Builder::build);

	protected static void setupMlDataFrameAnalyticsJobsCountDeserializer(
			DelegatingDeserializer<MlDataFrameAnalyticsJobsCount.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");

	}

}
