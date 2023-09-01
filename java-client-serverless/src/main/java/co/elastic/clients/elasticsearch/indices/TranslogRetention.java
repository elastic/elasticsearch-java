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

import co.elastic.clients.elasticsearch._types.Time;
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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.TranslogRetention

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.TranslogRetention">API
 *      specification</a>
 */
@JsonpDeserializable
public class TranslogRetention implements JsonpSerializable {
	@Nullable
	private final String size;

	@Nullable
	private final Time age;

	// ---------------------------------------------------------------------------------------------

	private TranslogRetention(Builder builder) {

		this.size = builder.size;
		this.age = builder.age;

	}

	public static TranslogRetention of(Function<Builder, ObjectBuilder<TranslogRetention>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * This controls the total size of translog files to keep for each shard.
	 * Keeping more translog files increases the chance of performing an operation
	 * based sync when recovering a replica. If the translog files are not
	 * sufficient, replica recovery will fall back to a file based sync. This
	 * setting is ignored, and should not be set, if soft deletes are enabled. Soft
	 * deletes are enabled by default in indices created in Elasticsearch versions
	 * 7.0.0 and later.
	 * <p>
	 * API name: {@code size}
	 */
	@Nullable
	public final String size() {
		return this.size;
	}

	/**
	 * This controls the maximum duration for which translog files are kept by each
	 * shard. Keeping more translog files increases the chance of performing an
	 * operation based sync when recovering replicas. If the translog files are not
	 * sufficient, replica recovery will fall back to a file based sync. This
	 * setting is ignored, and should not be set, if soft deletes are enabled. Soft
	 * deletes are enabled by default in indices created in Elasticsearch versions
	 * 7.0.0 and later.
	 * <p>
	 * API name: {@code age}
	 */
	@Nullable
	public final Time age() {
		return this.age;
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

		if (this.size != null) {
			generator.writeKey("size");
			generator.write(this.size);

		}
		if (this.age != null) {
			generator.writeKey("age");
			this.age.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TranslogRetention}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<TranslogRetention> {
		@Nullable
		private String size;

		@Nullable
		private Time age;

		/**
		 * This controls the total size of translog files to keep for each shard.
		 * Keeping more translog files increases the chance of performing an operation
		 * based sync when recovering a replica. If the translog files are not
		 * sufficient, replica recovery will fall back to a file based sync. This
		 * setting is ignored, and should not be set, if soft deletes are enabled. Soft
		 * deletes are enabled by default in indices created in Elasticsearch versions
		 * 7.0.0 and later.
		 * <p>
		 * API name: {@code size}
		 */
		public final Builder size(@Nullable String value) {
			this.size = value;
			return this;
		}

		/**
		 * This controls the maximum duration for which translog files are kept by each
		 * shard. Keeping more translog files increases the chance of performing an
		 * operation based sync when recovering replicas. If the translog files are not
		 * sufficient, replica recovery will fall back to a file based sync. This
		 * setting is ignored, and should not be set, if soft deletes are enabled. Soft
		 * deletes are enabled by default in indices created in Elasticsearch versions
		 * 7.0.0 and later.
		 * <p>
		 * API name: {@code age}
		 */
		public final Builder age(@Nullable Time value) {
			this.age = value;
			return this;
		}

		/**
		 * This controls the maximum duration for which translog files are kept by each
		 * shard. Keeping more translog files increases the chance of performing an
		 * operation based sync when recovering replicas. If the translog files are not
		 * sufficient, replica recovery will fall back to a file based sync. This
		 * setting is ignored, and should not be set, if soft deletes are enabled. Soft
		 * deletes are enabled by default in indices created in Elasticsearch versions
		 * 7.0.0 and later.
		 * <p>
		 * API name: {@code age}
		 */
		public final Builder age(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.age(fn.apply(new Time.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TranslogRetention}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TranslogRetention build() {
			_checkSingleUse();

			return new TranslogRetention(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TranslogRetention}
	 */
	public static final JsonpDeserializer<TranslogRetention> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TranslogRetention::setupTranslogRetentionDeserializer);

	protected static void setupTranslogRetentionDeserializer(ObjectDeserializer<TranslogRetention.Builder> op) {

		op.add(Builder::size, JsonpDeserializer.stringDeserializer(), "size");
		op.add(Builder::age, Time._DESERIALIZER, "age");

	}

}
