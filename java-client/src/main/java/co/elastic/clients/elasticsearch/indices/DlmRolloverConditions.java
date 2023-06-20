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
import java.lang.Long;
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices._types.DlmRolloverConditions

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#indices._types.DlmRolloverConditions">API
 *      specification</a>
 */
@JsonpDeserializable
public class DlmRolloverConditions implements JsonpSerializable {
	@Nullable
	private final Time minAge;

	@Nullable
	private final String maxAge;

	@Nullable
	private final Long minDocs;

	@Nullable
	private final Long maxDocs;

	@Nullable
	private final String minSize;

	@Nullable
	private final String maxSize;

	@Nullable
	private final String minPrimaryShardSize;

	@Nullable
	private final String maxPrimaryShardSize;

	@Nullable
	private final Long minPrimaryShardDocs;

	@Nullable
	private final Long maxPrimaryShardDocs;

	// ---------------------------------------------------------------------------------------------

	private DlmRolloverConditions(Builder builder) {

		this.minAge = builder.minAge;
		this.maxAge = builder.maxAge;
		this.minDocs = builder.minDocs;
		this.maxDocs = builder.maxDocs;
		this.minSize = builder.minSize;
		this.maxSize = builder.maxSize;
		this.minPrimaryShardSize = builder.minPrimaryShardSize;
		this.maxPrimaryShardSize = builder.maxPrimaryShardSize;
		this.minPrimaryShardDocs = builder.minPrimaryShardDocs;
		this.maxPrimaryShardDocs = builder.maxPrimaryShardDocs;

	}

	public static DlmRolloverConditions of(Function<Builder, ObjectBuilder<DlmRolloverConditions>> fn) {
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
	public final String maxAge() {
		return this.maxAge;
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
	 * API name: {@code min_size}
	 */
	@Nullable
	public final String minSize() {
		return this.minSize;
	}

	/**
	 * API name: {@code max_size}
	 */
	@Nullable
	public final String maxSize() {
		return this.maxSize;
	}

	/**
	 * API name: {@code min_primary_shard_size}
	 */
	@Nullable
	public final String minPrimaryShardSize() {
		return this.minPrimaryShardSize;
	}

	/**
	 * API name: {@code max_primary_shard_size}
	 */
	@Nullable
	public final String maxPrimaryShardSize() {
		return this.maxPrimaryShardSize;
	}

	/**
	 * API name: {@code min_primary_shard_docs}
	 */
	@Nullable
	public final Long minPrimaryShardDocs() {
		return this.minPrimaryShardDocs;
	}

	/**
	 * API name: {@code max_primary_shard_docs}
	 */
	@Nullable
	public final Long maxPrimaryShardDocs() {
		return this.maxPrimaryShardDocs;
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
			generator.write(this.maxAge);

		}
		if (this.minDocs != null) {
			generator.writeKey("min_docs");
			generator.write(this.minDocs);

		}
		if (this.maxDocs != null) {
			generator.writeKey("max_docs");
			generator.write(this.maxDocs);

		}
		if (this.minSize != null) {
			generator.writeKey("min_size");
			generator.write(this.minSize);

		}
		if (this.maxSize != null) {
			generator.writeKey("max_size");
			generator.write(this.maxSize);

		}
		if (this.minPrimaryShardSize != null) {
			generator.writeKey("min_primary_shard_size");
			generator.write(this.minPrimaryShardSize);

		}
		if (this.maxPrimaryShardSize != null) {
			generator.writeKey("max_primary_shard_size");
			generator.write(this.maxPrimaryShardSize);

		}
		if (this.minPrimaryShardDocs != null) {
			generator.writeKey("min_primary_shard_docs");
			generator.write(this.minPrimaryShardDocs);

		}
		if (this.maxPrimaryShardDocs != null) {
			generator.writeKey("max_primary_shard_docs");
			generator.write(this.maxPrimaryShardDocs);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DlmRolloverConditions}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DlmRolloverConditions> {
		@Nullable
		private Time minAge;

		@Nullable
		private String maxAge;

		@Nullable
		private Long minDocs;

		@Nullable
		private Long maxDocs;

		@Nullable
		private String minSize;

		@Nullable
		private String maxSize;

		@Nullable
		private String minPrimaryShardSize;

		@Nullable
		private String maxPrimaryShardSize;

		@Nullable
		private Long minPrimaryShardDocs;

		@Nullable
		private Long maxPrimaryShardDocs;

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
		public final Builder maxAge(@Nullable String value) {
			this.maxAge = value;
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
		 * API name: {@code min_size}
		 */
		public final Builder minSize(@Nullable String value) {
			this.minSize = value;
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
		 * API name: {@code min_primary_shard_size}
		 */
		public final Builder minPrimaryShardSize(@Nullable String value) {
			this.minPrimaryShardSize = value;
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
		 * API name: {@code min_primary_shard_docs}
		 */
		public final Builder minPrimaryShardDocs(@Nullable Long value) {
			this.minPrimaryShardDocs = value;
			return this;
		}

		/**
		 * API name: {@code max_primary_shard_docs}
		 */
		public final Builder maxPrimaryShardDocs(@Nullable Long value) {
			this.maxPrimaryShardDocs = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DlmRolloverConditions}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DlmRolloverConditions build() {
			_checkSingleUse();

			return new DlmRolloverConditions(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link DlmRolloverConditions}
	 */
	public static final JsonpDeserializer<DlmRolloverConditions> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DlmRolloverConditions::setupDlmRolloverConditionsDeserializer);

	protected static void setupDlmRolloverConditionsDeserializer(ObjectDeserializer<DlmRolloverConditions.Builder> op) {

		op.add(Builder::minAge, Time._DESERIALIZER, "min_age");
		op.add(Builder::maxAge, JsonpDeserializer.stringDeserializer(), "max_age");
		op.add(Builder::minDocs, JsonpDeserializer.longDeserializer(), "min_docs");
		op.add(Builder::maxDocs, JsonpDeserializer.longDeserializer(), "max_docs");
		op.add(Builder::minSize, JsonpDeserializer.stringDeserializer(), "min_size");
		op.add(Builder::maxSize, JsonpDeserializer.stringDeserializer(), "max_size");
		op.add(Builder::minPrimaryShardSize, JsonpDeserializer.stringDeserializer(), "min_primary_shard_size");
		op.add(Builder::maxPrimaryShardSize, JsonpDeserializer.stringDeserializer(), "max_primary_shard_size");
		op.add(Builder::minPrimaryShardDocs, JsonpDeserializer.longDeserializer(), "min_primary_shard_docs");
		op.add(Builder::maxPrimaryShardDocs, JsonpDeserializer.longDeserializer(), "max_primary_shard_docs");

	}

}
