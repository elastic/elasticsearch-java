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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.Translog

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices._types.Translog">API
 *      specification</a>
 */
@JsonpDeserializable
public class Translog implements JsonpSerializable {
	@Nullable
	private final String durability;

	@Nullable
	private final String flushThresholdSize;

	@Nullable
	private final TranslogRetention retention;

	// ---------------------------------------------------------------------------------------------

	private Translog(Builder builder) {

		this.durability = builder.durability;
		this.flushThresholdSize = builder.flushThresholdSize;
		this.retention = builder.retention;

	}

	public static Translog of(Function<Builder, ObjectBuilder<Translog>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code durability}
	 */
	@Nullable
	public final String durability() {
		return this.durability;
	}

	/**
	 * API name: {@code flush_threshold_size}
	 */
	@Nullable
	public final String flushThresholdSize() {
		return this.flushThresholdSize;
	}

	/**
	 * API name: {@code retention}
	 */
	@Nullable
	public final TranslogRetention retention() {
		return this.retention;
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

		if (this.durability != null) {
			generator.writeKey("durability");
			generator.write(this.durability);

		}
		if (this.flushThresholdSize != null) {
			generator.writeKey("flush_threshold_size");
			generator.write(this.flushThresholdSize);

		}
		if (this.retention != null) {
			generator.writeKey("retention");
			this.retention.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Translog}.
	 */

	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<Translog> {
		@Nullable
		private String durability;

		@Nullable
		private String flushThresholdSize;

		@Nullable
		private TranslogRetention retention;

		/**
		 * API name: {@code durability}
		 */
		public final Builder durability(@Nullable String value) {
			this.durability = value;
			return this;
		}

		/**
		 * API name: {@code flush_threshold_size}
		 */
		public final Builder flushThresholdSize(@Nullable String value) {
			this.flushThresholdSize = value;
			return this;
		}

		/**
		 * API name: {@code retention}
		 */
		public final Builder retention(@Nullable TranslogRetention value) {
			this.retention = value;
			return this;
		}

		/**
		 * API name: {@code retention}
		 */
		public final Builder retention(Function<TranslogRetention.Builder, ObjectBuilder<TranslogRetention>> fn) {
			return this.retention(fn.apply(new TranslogRetention.Builder()).build());
		}

		/**
		 * Builds a {@link Translog}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Translog build() {
			_checkSingleUse();

			return new Translog(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Translog}
	 */
	public static final JsonpDeserializer<Translog> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Translog::setupTranslogDeserializer);

	protected static void setupTranslogDeserializer(ObjectDeserializer<Translog.Builder> op) {

		op.add(Builder::durability, JsonpDeserializer.stringDeserializer(), "durability");
		op.add(Builder::flushThresholdSize, JsonpDeserializer.stringDeserializer(), "flush_threshold_size");
		op.add(Builder::retention, TranslogRetention._DESERIALIZER, "retention");

	}

}
