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

package co.elastic.clients.elasticsearch.nodes;

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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: nodes._types.JvmThreads

/**
 *
 * @see <a href="../doc-files/api-spec.html#nodes._types.JvmThreads">API
 *      specification</a>
 */
@JsonpDeserializable
public class JvmThreads implements JsonpSerializable {
	@Nullable
	private final Long count;

	@Nullable
	private final Long peakCount;

	// ---------------------------------------------------------------------------------------------

	private JvmThreads(Builder builder) {

		this.count = builder.count;
		this.peakCount = builder.peakCount;

	}

	public static JvmThreads of(Function<Builder, ObjectBuilder<JvmThreads>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code count}
	 */
	@Nullable
	public final Long count() {
		return this.count;
	}

	/**
	 * API name: {@code peak_count}
	 */
	@Nullable
	public final Long peakCount() {
		return this.peakCount;
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

		if (this.count != null) {
			generator.writeKey("count");
			generator.write(this.count);

		}
		if (this.peakCount != null) {
			generator.writeKey("peak_count");
			generator.write(this.peakCount);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JvmThreads}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<JvmThreads> {
		@Nullable
		private Long count;

		@Nullable
		private Long peakCount;

		/**
		 * API name: {@code count}
		 */
		public final Builder count(@Nullable Long value) {
			this.count = value;
			return this;
		}

		/**
		 * API name: {@code peak_count}
		 */
		public final Builder peakCount(@Nullable Long value) {
			this.peakCount = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link JvmThreads}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public JvmThreads build() {
			_checkSingleUse();

			return new JvmThreads(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link JvmThreads}
	 */
	public static final JsonpDeserializer<JvmThreads> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			JvmThreads::setupJvmThreadsDeserializer);

	protected static void setupJvmThreadsDeserializer(ObjectDeserializer<JvmThreads.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::peakCount, JsonpDeserializer.longDeserializer(), "peak_count");

	}

}
