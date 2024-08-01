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

package co.elastic.clients.elasticsearch.ilm;

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

//----------------------------------------------------------------
//       THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------------------
//
// This code is generated from the Elasticsearch API specification
// at https://github.com/elastic/elasticsearch-specification
//
// Manual updates to this file will be lost when the code is
// re-generated.
//
// If you find a property that is missing or wrongly typed, please
// open an issue or a PR on the API specification repository.
//
//----------------------------------------------------------------

// typedef: ilm._types.RolloverAction

/**
 *
 * @see <a href="../doc-files/api-spec.html#ilm._types.RolloverAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class RolloverAction implements JsonpSerializable {
	@Nullable
	private final String maxSize;

	@Nullable
	private final String maxPrimaryShardSize;

	@Nullable
	private final Time maxAge;

	@Nullable
	private final Long maxDocs;

	@Nullable
	private final Long maxPrimaryShardDocs;

	@Nullable
	private final String minSize;

	@Nullable
	private final String minPrimaryShardSize;

	@Nullable
	private final Time minAge;

	@Nullable
	private final Long minDocs;

	@Nullable
	private final Long minPrimaryShardDocs;

	// ---------------------------------------------------------------------------------------------

	private RolloverAction(Builder builder) {

		this.maxSize = builder.maxSize;
		this.maxPrimaryShardSize = builder.maxPrimaryShardSize;
		this.maxAge = builder.maxAge;
		this.maxDocs = builder.maxDocs;
		this.maxPrimaryShardDocs = builder.maxPrimaryShardDocs;
		this.minSize = builder.minSize;
		this.minPrimaryShardSize = builder.minPrimaryShardSize;
		this.minAge = builder.minAge;
		this.minDocs = builder.minDocs;
		this.minPrimaryShardDocs = builder.minPrimaryShardDocs;

	}

	public static RolloverAction of(Function<Builder, ObjectBuilder<RolloverAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code max_size}
	 */
	@Nullable
	public final String maxSize() {
		return this.maxSize;
	}

	/**
	 * API name: {@code max_primary_shard_size}
	 */
	@Nullable
	public final String maxPrimaryShardSize() {
		return this.maxPrimaryShardSize;
	}

	/**
	 * API name: {@code max_age}
	 */
	@Nullable
	public final Time maxAge() {
		return this.maxAge;
	}

	/**
	 * API name: {@code max_docs}
	 */
	@Nullable
	public final Long maxDocs() {
		return this.maxDocs;
	}

	/**
	 * API name: {@code max_primary_shard_docs}
	 */
	@Nullable
	public final Long maxPrimaryShardDocs() {
		return this.maxPrimaryShardDocs;
	}

	/**
	 * API name: {@code min_size}
	 */
	@Nullable
	public final String minSize() {
		return this.minSize;
	}

	/**
	 * API name: {@code min_primary_shard_size}
	 */
	@Nullable
	public final String minPrimaryShardSize() {
		return this.minPrimaryShardSize;
	}

	/**
	 * API name: {@code min_age}
	 */
	@Nullable
	public final Time minAge() {
		return this.minAge;
	}

	/**
	 * API name: {@code min_docs}
	 */
	@Nullable
	public final Long minDocs() {
		return this.minDocs;
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

		if (this.maxSize != null) {
			generator.writeKey("max_size");
			generator.write(this.maxSize);

		}
		if (this.maxPrimaryShardSize != null) {
			generator.writeKey("max_primary_shard_size");
			generator.write(this.maxPrimaryShardSize);

		}
		if (this.maxAge != null) {
			generator.writeKey("max_age");
			this.maxAge.serialize(generator, mapper);

		}
		if (this.maxDocs != null) {
			generator.writeKey("max_docs");
			generator.write(this.maxDocs);

		}
		if (this.maxPrimaryShardDocs != null) {
			generator.writeKey("max_primary_shard_docs");
			generator.write(this.maxPrimaryShardDocs);

		}
		if (this.minSize != null) {
			generator.writeKey("min_size");
			generator.write(this.minSize);

		}
		if (this.minPrimaryShardSize != null) {
			generator.writeKey("min_primary_shard_size");
			generator.write(this.minPrimaryShardSize);

		}
		if (this.minAge != null) {
			generator.writeKey("min_age");
			this.minAge.serialize(generator, mapper);

		}
		if (this.minDocs != null) {
			generator.writeKey("min_docs");
			generator.write(this.minDocs);

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
	 * Builder for {@link RolloverAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RolloverAction> {
		@Nullable
		private String maxSize;

		@Nullable
		private String maxPrimaryShardSize;

		@Nullable
		private Time maxAge;

		@Nullable
		private Long maxDocs;

		@Nullable
		private Long maxPrimaryShardDocs;

		@Nullable
		private String minSize;

		@Nullable
		private String minPrimaryShardSize;

		@Nullable
		private Time minAge;

		@Nullable
		private Long minDocs;

		@Nullable
		private Long minPrimaryShardDocs;

		/**
		 * API name: {@code max_size}
		 */
		public final Builder maxSize(@Nullable String value) {
			this.maxSize = value;
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
		 * API name: {@code max_docs}
		 */
		public final Builder maxDocs(@Nullable Long value) {
			this.maxDocs = value;
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
		 * API name: {@code min_size}
		 */
		public final Builder minSize(@Nullable String value) {
			this.minSize = value;
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
		 * API name: {@code min_docs}
		 */
		public final Builder minDocs(@Nullable Long value) {
			this.minDocs = value;
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
		 * Builds a {@link RolloverAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RolloverAction build() {
			_checkSingleUse();

			return new RolloverAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RolloverAction}
	 */
	public static final JsonpDeserializer<RolloverAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RolloverAction::setupRolloverActionDeserializer);

	protected static void setupRolloverActionDeserializer(ObjectDeserializer<RolloverAction.Builder> op) {

		op.add(Builder::maxSize, JsonpDeserializer.stringDeserializer(), "max_size");
		op.add(Builder::maxPrimaryShardSize, JsonpDeserializer.stringDeserializer(), "max_primary_shard_size");
		op.add(Builder::maxAge, Time._DESERIALIZER, "max_age");
		op.add(Builder::maxDocs, JsonpDeserializer.longDeserializer(), "max_docs");
		op.add(Builder::maxPrimaryShardDocs, JsonpDeserializer.longDeserializer(), "max_primary_shard_docs");
		op.add(Builder::minSize, JsonpDeserializer.stringDeserializer(), "min_size");
		op.add(Builder::minPrimaryShardSize, JsonpDeserializer.stringDeserializer(), "min_primary_shard_size");
		op.add(Builder::minAge, Time._DESERIALIZER, "min_age");
		op.add(Builder::minDocs, JsonpDeserializer.longDeserializer(), "min_docs");
		op.add(Builder::minPrimaryShardDocs, JsonpDeserializer.longDeserializer(), "min_primary_shard_docs");

	}

}
