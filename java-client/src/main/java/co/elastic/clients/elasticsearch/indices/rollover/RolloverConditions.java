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

package co.elastic.clients.elasticsearch.indices.rollover;

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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.rollover.RolloverConditions

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.rollover.RolloverConditions">API
 *      specification</a>
 */
@JsonpDeserializable
public class RolloverConditions implements JsonpSerializable {
	@Nullable
	private final Time minAge;

	@Nullable
	private final Time maxAge;

	@Nullable
	private final Long maxAgeMillis;

	@Nullable
	private final Long minDocs;

	@Nullable
	private final Long maxDocs;

	@Nullable
	private final String maxSize;

	@Nullable
	private final Long maxSizeBytes;

	@Nullable
	private final String minSize;

	@Nullable
	private final Long minSizeBytes;

	@Nullable
	private final String maxPrimaryShardSize;

	@Nullable
	private final Long maxPrimaryShardSizeBytes;

	@Nullable
	private final String minPrimaryShardSize;

	@Nullable
	private final Long minPrimaryShardSizeBytes;

	@Nullable
	private final Long maxPrimaryShardDocs;

	@Nullable
	private final Long minPrimaryShardDocs;

	// ---------------------------------------------------------------------------------------------

	private RolloverConditions(Builder builder) {

		this.minAge = builder.minAge;
		this.maxAge = builder.maxAge;
		this.maxAgeMillis = builder.maxAgeMillis;
		this.minDocs = builder.minDocs;
		this.maxDocs = builder.maxDocs;
		this.maxSize = builder.maxSize;
		this.maxSizeBytes = builder.maxSizeBytes;
		this.minSize = builder.minSize;
		this.minSizeBytes = builder.minSizeBytes;
		this.maxPrimaryShardSize = builder.maxPrimaryShardSize;
		this.maxPrimaryShardSizeBytes = builder.maxPrimaryShardSizeBytes;
		this.minPrimaryShardSize = builder.minPrimaryShardSize;
		this.minPrimaryShardSizeBytes = builder.minPrimaryShardSizeBytes;
		this.maxPrimaryShardDocs = builder.maxPrimaryShardDocs;
		this.minPrimaryShardDocs = builder.minPrimaryShardDocs;

	}

	public static RolloverConditions of(Function<Builder, ObjectBuilder<RolloverConditions>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code min_age}
	 */
	@Nullable
	public final Time minAge() {
		return this.minAge;
	}

	/**
	 * API name: {@code max_age}
	 */
	@Nullable
	public final Time maxAge() {
		return this.maxAge;
	}

	/**
	 * API name: {@code max_age_millis}
	 */
	@Nullable
	public final Long maxAgeMillis() {
		return this.maxAgeMillis;
	}

	/**
	 * API name: {@code min_docs}
	 */
	@Nullable
	public final Long minDocs() {
		return this.minDocs;
	}

	/**
	 * API name: {@code max_docs}
	 */
	@Nullable
	public final Long maxDocs() {
		return this.maxDocs;
	}

	/**
	 * API name: {@code max_size}
	 */
	@Nullable
	public final String maxSize() {
		return this.maxSize;
	}

	/**
	 * API name: {@code max_size_bytes}
	 */
	@Nullable
	public final Long maxSizeBytes() {
		return this.maxSizeBytes;
	}

	/**
	 * API name: {@code min_size}
	 */
	@Nullable
	public final String minSize() {
		return this.minSize;
	}

	/**
	 * API name: {@code min_size_bytes}
	 */
	@Nullable
	public final Long minSizeBytes() {
		return this.minSizeBytes;
	}

	/**
	 * API name: {@code max_primary_shard_size}
	 */
	@Nullable
	public final String maxPrimaryShardSize() {
		return this.maxPrimaryShardSize;
	}

	/**
	 * API name: {@code max_primary_shard_size_bytes}
	 */
	@Nullable
	public final Long maxPrimaryShardSizeBytes() {
		return this.maxPrimaryShardSizeBytes;
	}

	/**
	 * API name: {@code min_primary_shard_size}
	 */
	@Nullable
	public final String minPrimaryShardSize() {
		return this.minPrimaryShardSize;
	}

	/**
	 * API name: {@code min_primary_shard_size_bytes}
	 */
	@Nullable
	public final Long minPrimaryShardSizeBytes() {
		return this.minPrimaryShardSizeBytes;
	}

	/**
	 * API name: {@code max_primary_shard_docs}
	 */
	@Nullable
	public final Long maxPrimaryShardDocs() {
		return this.maxPrimaryShardDocs;
	}

	/**
	 * API name: {@code min_primary_shard_docs}
	 */
	@Nullable
	public final Long minPrimaryShardDocs() {
		return this.minPrimaryShardDocs;
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

		if (this.minAge != null) {
			generator.writeKey("min_age");
			this.minAge.serialize(generator, mapper);

		}
		if (this.maxAge != null) {
			generator.writeKey("max_age");
			this.maxAge.serialize(generator, mapper);

		}
		if (this.maxAgeMillis != null) {
			generator.writeKey("max_age_millis");
			generator.write(this.maxAgeMillis);

		}
		if (this.minDocs != null) {
			generator.writeKey("min_docs");
			generator.write(this.minDocs);

		}
		if (this.maxDocs != null) {
			generator.writeKey("max_docs");
			generator.write(this.maxDocs);

		}
		if (this.maxSize != null) {
			generator.writeKey("max_size");
			generator.write(this.maxSize);

		}
		if (this.maxSizeBytes != null) {
			generator.writeKey("max_size_bytes");
			generator.write(this.maxSizeBytes);

		}
		if (this.minSize != null) {
			generator.writeKey("min_size");
			generator.write(this.minSize);

		}
		if (this.minSizeBytes != null) {
			generator.writeKey("min_size_bytes");
			generator.write(this.minSizeBytes);

		}
		if (this.maxPrimaryShardSize != null) {
			generator.writeKey("max_primary_shard_size");
			generator.write(this.maxPrimaryShardSize);

		}
		if (this.maxPrimaryShardSizeBytes != null) {
			generator.writeKey("max_primary_shard_size_bytes");
			generator.write(this.maxPrimaryShardSizeBytes);

		}
		if (this.minPrimaryShardSize != null) {
			generator.writeKey("min_primary_shard_size");
			generator.write(this.minPrimaryShardSize);

		}
		if (this.minPrimaryShardSizeBytes != null) {
			generator.writeKey("min_primary_shard_size_bytes");
			generator.write(this.minPrimaryShardSizeBytes);

		}
		if (this.maxPrimaryShardDocs != null) {
			generator.writeKey("max_primary_shard_docs");
			generator.write(this.maxPrimaryShardDocs);

		}
		if (this.minPrimaryShardDocs != null) {
			generator.writeKey("min_primary_shard_docs");
			generator.write(this.minPrimaryShardDocs);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RolloverConditions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RolloverConditions> {
		@Nullable
		private Time minAge;

		@Nullable
		private Time maxAge;

		@Nullable
		private Long maxAgeMillis;

		@Nullable
		private Long minDocs;

		@Nullable
		private Long maxDocs;

		@Nullable
		private String maxSize;

		@Nullable
		private Long maxSizeBytes;

		@Nullable
		private String minSize;

		@Nullable
		private Long minSizeBytes;

		@Nullable
		private String maxPrimaryShardSize;

		@Nullable
		private Long maxPrimaryShardSizeBytes;

		@Nullable
		private String minPrimaryShardSize;

		@Nullable
		private Long minPrimaryShardSizeBytes;

		@Nullable
		private Long maxPrimaryShardDocs;

		@Nullable
		private Long minPrimaryShardDocs;

		/**
		 * API name: {@code min_age}
		 */
		public final Builder minAge(@Nullable Time value) {
			this.minAge = value;
			return this;
		}

		/**
		 * API name: {@code min_age}
		 */
		public final Builder minAge(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.minAge(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code max_age}
		 */
		public final Builder maxAge(@Nullable Time value) {
			this.maxAge = value;
			return this;
		}

		/**
		 * API name: {@code max_age}
		 */
		public final Builder maxAge(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.maxAge(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code max_age_millis}
		 */
		public final Builder maxAgeMillis(@Nullable Long value) {
			this.maxAgeMillis = value;
			return this;
		}

		/**
		 * API name: {@code min_docs}
		 */
		public final Builder minDocs(@Nullable Long value) {
			this.minDocs = value;
			return this;
		}

		/**
		 * API name: {@code max_docs}
		 */
		public final Builder maxDocs(@Nullable Long value) {
			this.maxDocs = value;
			return this;
		}

		/**
		 * API name: {@code max_size}
		 */
		public final Builder maxSize(@Nullable String value) {
			this.maxSize = value;
			return this;
		}

		/**
		 * API name: {@code max_size_bytes}
		 */
		public final Builder maxSizeBytes(@Nullable Long value) {
			this.maxSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code min_size}
		 */
		public final Builder minSize(@Nullable String value) {
			this.minSize = value;
			return this;
		}

		/**
		 * API name: {@code min_size_bytes}
		 */
		public final Builder minSizeBytes(@Nullable Long value) {
			this.minSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code max_primary_shard_size}
		 */
		public final Builder maxPrimaryShardSize(@Nullable String value) {
			this.maxPrimaryShardSize = value;
			return this;
		}

		/**
		 * API name: {@code max_primary_shard_size_bytes}
		 */
		public final Builder maxPrimaryShardSizeBytes(@Nullable Long value) {
			this.maxPrimaryShardSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code min_primary_shard_size}
		 */
		public final Builder minPrimaryShardSize(@Nullable String value) {
			this.minPrimaryShardSize = value;
			return this;
		}

		/**
		 * API name: {@code min_primary_shard_size_bytes}
		 */
		public final Builder minPrimaryShardSizeBytes(@Nullable Long value) {
			this.minPrimaryShardSizeBytes = value;
			return this;
		}

		/**
		 * API name: {@code max_primary_shard_docs}
		 */
		public final Builder maxPrimaryShardDocs(@Nullable Long value) {
			this.maxPrimaryShardDocs = value;
			return this;
		}

		/**
		 * API name: {@code min_primary_shard_docs}
		 */
		public final Builder minPrimaryShardDocs(@Nullable Long value) {
			this.minPrimaryShardDocs = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RolloverConditions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RolloverConditions build() {
			_checkSingleUse();

			return new RolloverConditions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RolloverConditions}
	 */
	public static final JsonpDeserializer<RolloverConditions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RolloverConditions::setupRolloverConditionsDeserializer);

	protected static void setupRolloverConditionsDeserializer(ObjectDeserializer<RolloverConditions.Builder> op) {

		op.add(Builder::minAge, Time._DESERIALIZER, "min_age");
		op.add(Builder::maxAge, Time._DESERIALIZER, "max_age");
		op.add(Builder::maxAgeMillis, JsonpDeserializer.longDeserializer(), "max_age_millis");
		op.add(Builder::minDocs, JsonpDeserializer.longDeserializer(), "min_docs");
		op.add(Builder::maxDocs, JsonpDeserializer.longDeserializer(), "max_docs");
		op.add(Builder::maxSize, JsonpDeserializer.stringDeserializer(), "max_size");
		op.add(Builder::maxSizeBytes, JsonpDeserializer.longDeserializer(), "max_size_bytes");
		op.add(Builder::minSize, JsonpDeserializer.stringDeserializer(), "min_size");
		op.add(Builder::minSizeBytes, JsonpDeserializer.longDeserializer(), "min_size_bytes");
		op.add(Builder::maxPrimaryShardSize, JsonpDeserializer.stringDeserializer(), "max_primary_shard_size");
		op.add(Builder::maxPrimaryShardSizeBytes, JsonpDeserializer.longDeserializer(), "max_primary_shard_size_bytes");
		op.add(Builder::minPrimaryShardSize, JsonpDeserializer.stringDeserializer(), "min_primary_shard_size");
		op.add(Builder::minPrimaryShardSizeBytes, JsonpDeserializer.longDeserializer(), "min_primary_shard_size_bytes");
		op.add(Builder::maxPrimaryShardDocs, JsonpDeserializer.longDeserializer(), "max_primary_shard_docs");
		op.add(Builder::minPrimaryShardDocs, JsonpDeserializer.longDeserializer(), "min_primary_shard_docs");

	}

}
