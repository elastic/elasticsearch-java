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
import java.lang.Boolean;
import java.lang.Integer;
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

// typedef: ilm._types.ShrinkAction

/**
 *
 * @see <a href="../doc-files/api-spec.html#ilm._types.ShrinkAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class ShrinkAction implements JsonpSerializable {
	@Nullable
	private final Integer numberOfShards;

	@Nullable
	private final String maxPrimaryShardSize;

	@Nullable
	private final Boolean allowWriteAfterShrink;

	// ---------------------------------------------------------------------------------------------

	private ShrinkAction(Builder builder) {

		this.numberOfShards = builder.numberOfShards;
		this.maxPrimaryShardSize = builder.maxPrimaryShardSize;
		this.allowWriteAfterShrink = builder.allowWriteAfterShrink;

	}

	public static ShrinkAction of(Function<Builder, ObjectBuilder<ShrinkAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code number_of_shards}
	 */
	@Nullable
	public final Integer numberOfShards() {
		return this.numberOfShards;
	}

	/**
	 * API name: {@code max_primary_shard_size}
	 */
	@Nullable
	public final String maxPrimaryShardSize() {
		return this.maxPrimaryShardSize;
	}

	/**
	 * API name: {@code allow_write_after_shrink}
	 */
	@Nullable
	public final Boolean allowWriteAfterShrink() {
		return this.allowWriteAfterShrink;
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

		if (this.numberOfShards != null) {
			generator.writeKey("number_of_shards");
			generator.write(this.numberOfShards);

		}
		if (this.maxPrimaryShardSize != null) {
			generator.writeKey("max_primary_shard_size");
			generator.write(this.maxPrimaryShardSize);

		}
		if (this.allowWriteAfterShrink != null) {
			generator.writeKey("allow_write_after_shrink");
			generator.write(this.allowWriteAfterShrink);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ShrinkAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<ShrinkAction> {
		@Nullable
		private Integer numberOfShards;

		@Nullable
		private String maxPrimaryShardSize;

		@Nullable
		private Boolean allowWriteAfterShrink;

		/**
		 * API name: {@code number_of_shards}
		 */
		public final Builder numberOfShards(@Nullable Integer value) {
			this.numberOfShards = value;
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
		 * API name: {@code allow_write_after_shrink}
		 */
		public final Builder allowWriteAfterShrink(@Nullable Boolean value) {
			this.allowWriteAfterShrink = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ShrinkAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ShrinkAction build() {
			_checkSingleUse();

			return new ShrinkAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ShrinkAction}
	 */
	public static final JsonpDeserializer<ShrinkAction> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			ShrinkAction::setupShrinkActionDeserializer);

	protected static void setupShrinkActionDeserializer(ObjectDeserializer<ShrinkAction.Builder> op) {

		op.add(Builder::numberOfShards, JsonpDeserializer.integerDeserializer(), "number_of_shards");
		op.add(Builder::maxPrimaryShardSize, JsonpDeserializer.stringDeserializer(), "max_primary_shard_size");
		op.add(Builder::allowWriteAfterShrink, JsonpDeserializer.booleanDeserializer(), "allow_write_after_shrink");

	}

}
