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

import co.elastic.clients.json.DelegatingDeserializer;
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
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;

// typedef: nodes._types.JvmThreads
@JsonpDeserializable
public class JvmThreads implements JsonpSerializable {
	private final long count;

	private final long peakCount;

	// ---------------------------------------------------------------------------------------------

	private JvmThreads(Builder builder) {

		this.count = ModelTypeHelper.requireNonNull(builder.count, this, "count");
		this.peakCount = ModelTypeHelper.requireNonNull(builder.peakCount, this, "peakCount");

	}

	public static JvmThreads of(Function<Builder, ObjectBuilder<JvmThreads>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code count}
	 */
	public final long count() {
		return this.count;
	}

	/**
	 * Required - API name: {@code peak_count}
	 */
	public final long peakCount() {
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

		generator.writeKey("count");
		generator.write(this.count);

		generator.writeKey("peak_count");
		generator.write(this.peakCount);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link JvmThreads}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<JvmThreads> {
		private Long count;

		private Long peakCount;

		/**
		 * Required - API name: {@code count}
		 */
		public final Builder count(long value) {
			this.count = value;
			return this;
		}

		/**
		 * Required - API name: {@code peak_count}
		 */
		public final Builder peakCount(long value) {
			this.peakCount = value;
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
			JvmThreads::setupJvmThreadsDeserializer, Builder::build);

	protected static void setupJvmThreadsDeserializer(DelegatingDeserializer<JvmThreads.Builder> op) {

		op.add(Builder::count, JsonpDeserializer.longDeserializer(), "count");
		op.add(Builder::peakCount, JsonpDeserializer.longDeserializer(), "peak_count");

	}

}
