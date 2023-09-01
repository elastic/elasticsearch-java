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
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.MergeScheduler

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.MergeScheduler">API
 *      specification</a>
 */
@JsonpDeserializable
public class MergeScheduler implements JsonpSerializable {
	@Nullable
	private final Integer maxThreadCount;

	@Nullable
	private final Integer maxMergeCount;

	// ---------------------------------------------------------------------------------------------

	private MergeScheduler(Builder builder) {

		this.maxThreadCount = builder.maxThreadCount;
		this.maxMergeCount = builder.maxMergeCount;

	}

	public static MergeScheduler of(Function<Builder, ObjectBuilder<MergeScheduler>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code max_thread_count}
	 */
	@Nullable
	public final Integer maxThreadCount() {
		return this.maxThreadCount;
	}

	/**
	 * API name: {@code max_merge_count}
	 */
	@Nullable
	public final Integer maxMergeCount() {
		return this.maxMergeCount;
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

		if (this.maxThreadCount != null) {
			generator.writeKey("max_thread_count");
			generator.write(this.maxThreadCount);

		}
		if (this.maxMergeCount != null) {
			generator.writeKey("max_merge_count");
			generator.write(this.maxMergeCount);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MergeScheduler}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<MergeScheduler> {
		@Nullable
		private Integer maxThreadCount;

		@Nullable
		private Integer maxMergeCount;

		/**
		 * API name: {@code max_thread_count}
		 */
		public final Builder maxThreadCount(@Nullable Integer value) {
			this.maxThreadCount = value;
			return this;
		}

		/**
		 * API name: {@code max_merge_count}
		 */
		public final Builder maxMergeCount(@Nullable Integer value) {
			this.maxMergeCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MergeScheduler}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MergeScheduler build() {
			_checkSingleUse();

			return new MergeScheduler(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MergeScheduler}
	 */
	public static final JsonpDeserializer<MergeScheduler> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			MergeScheduler::setupMergeSchedulerDeserializer);

	protected static void setupMergeSchedulerDeserializer(ObjectDeserializer<MergeScheduler.Builder> op) {

		op.add(Builder::maxThreadCount, JsonpDeserializer.integerDeserializer(), "max_thread_count");
		op.add(Builder::maxMergeCount, JsonpDeserializer.integerDeserializer(), "max_merge_count");

	}

}
