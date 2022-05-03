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
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.Merge

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.Merge">API
 *      specification</a>
 */
@JsonpDeserializable
public class Merge implements JsonpSerializable {
	@Nullable
	private final MergeScheduler scheduler;

	// ---------------------------------------------------------------------------------------------

	private Merge(Builder builder) {

		this.scheduler = builder.scheduler;

	}

	public static Merge of(Function<Builder, ObjectBuilder<Merge>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code scheduler}
	 */
	@Nullable
	public final MergeScheduler scheduler() {
		return this.scheduler;
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

		if (this.scheduler != null) {
			generator.writeKey("scheduler");
			this.scheduler.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Merge}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Merge> {
		@Nullable
		private MergeScheduler scheduler;

		/**
		 * API name: {@code scheduler}
		 */
		public final Builder scheduler(@Nullable MergeScheduler value) {
			this.scheduler = value;
			return this;
		}

		/**
		 * API name: {@code scheduler}
		 */
		public final Builder scheduler(Function<MergeScheduler.Builder, ObjectBuilder<MergeScheduler>> fn) {
			return this.scheduler(fn.apply(new MergeScheduler.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Merge}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Merge build() {
			_checkSingleUse();

			return new Merge(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Merge}
	 */
	public static final JsonpDeserializer<Merge> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Merge::setupMergeDeserializer);

	protected static void setupMergeDeserializer(ObjectDeserializer<Merge.Builder> op) {

		op.add(Builder::scheduler, MergeScheduler._DESERIALIZER, "scheduler");

	}

}
