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

package co.elastic.clients.elasticsearch.indices.recovery;

import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.recovery.VerifyIndex
@JsonpDeserializable
public final class VerifyIndex implements JsonpSerializable {
	@Nullable
	private final String checkIndexTime;

	private final String checkIndexTimeInMillis;

	@Nullable
	private final String totalTime;

	private final String totalTimeInMillis;

	// ---------------------------------------------------------------------------------------------

	public VerifyIndex(Builder builder) {

		this.checkIndexTime = builder.checkIndexTime;
		this.checkIndexTimeInMillis = Objects.requireNonNull(builder.checkIndexTimeInMillis,
				"check_index_time_in_millis");
		this.totalTime = builder.totalTime;
		this.totalTimeInMillis = Objects.requireNonNull(builder.totalTimeInMillis, "total_time_in_millis");

	}

	public VerifyIndex(Function<Builder, Builder> fn) {
		this(fn.apply(new Builder()));
	}

	/**
	 * API name: {@code check_index_time}
	 */
	@Nullable
	public String checkIndexTime() {
		return this.checkIndexTime;
	}

	/**
	 * Required - API name: {@code check_index_time_in_millis}
	 */
	public String checkIndexTimeInMillis() {
		return this.checkIndexTimeInMillis;
	}

	/**
	 * API name: {@code total_time}
	 */
	@Nullable
	public String totalTime() {
		return this.totalTime;
	}

	/**
	 * Required - API name: {@code total_time_in_millis}
	 */
	public String totalTimeInMillis() {
		return this.totalTimeInMillis;
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

		if (this.checkIndexTime != null) {

			generator.writeKey("check_index_time");
			generator.write(this.checkIndexTime);

		}

		generator.writeKey("check_index_time_in_millis");
		generator.write(this.checkIndexTimeInMillis);

		if (this.totalTime != null) {

			generator.writeKey("total_time");
			generator.write(this.totalTime);

		}

		generator.writeKey("total_time_in_millis");
		generator.write(this.totalTimeInMillis);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link VerifyIndex}.
	 */
	public static class Builder implements ObjectBuilder<VerifyIndex> {
		@Nullable
		private String checkIndexTime;

		private String checkIndexTimeInMillis;

		@Nullable
		private String totalTime;

		private String totalTimeInMillis;

		/**
		 * API name: {@code check_index_time}
		 */
		public Builder checkIndexTime(@Nullable String value) {
			this.checkIndexTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code check_index_time_in_millis}
		 */
		public Builder checkIndexTimeInMillis(String value) {
			this.checkIndexTimeInMillis = value;
			return this;
		}

		/**
		 * API name: {@code total_time}
		 */
		public Builder totalTime(@Nullable String value) {
			this.totalTime = value;
			return this;
		}

		/**
		 * Required - API name: {@code total_time_in_millis}
		 */
		public Builder totalTimeInMillis(String value) {
			this.totalTimeInMillis = value;
			return this;
		}

		/**
		 * Builds a {@link VerifyIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public VerifyIndex build() {

			return new VerifyIndex(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link VerifyIndex}
	 */
	public static final JsonpDeserializer<VerifyIndex> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			VerifyIndex::setupVerifyIndexDeserializer, Builder::build);

	protected static void setupVerifyIndexDeserializer(DelegatingDeserializer<VerifyIndex.Builder> op) {

		op.add(Builder::checkIndexTime, JsonpDeserializer.stringDeserializer(), "check_index_time");
		op.add(Builder::checkIndexTimeInMillis, JsonpDeserializer.stringDeserializer(), "check_index_time_in_millis");
		op.add(Builder::totalTime, JsonpDeserializer.stringDeserializer(), "total_time");
		op.add(Builder::totalTimeInMillis, JsonpDeserializer.stringDeserializer(), "total_time_in_millis");

	}

}
