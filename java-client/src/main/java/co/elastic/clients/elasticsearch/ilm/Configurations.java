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

package co.elastic.clients.elasticsearch.ilm;

import co.elastic.clients.elasticsearch.indices.rollover.RolloverConditions;
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

// typedef: ilm._types.Configurations

/**
 *
 * @see <a href="../doc-files/api-spec.html#ilm._types.Configurations">API
 *      specification</a>
 */
@JsonpDeserializable
public class Configurations implements JsonpSerializable {
	@Nullable
	private final RolloverConditions rollover;

	@Nullable
	private final ForceMergeConfiguration forcemerge;

	@Nullable
	private final ShrinkConfiguration shrink;

	// ---------------------------------------------------------------------------------------------

	private Configurations(Builder builder) {

		this.rollover = builder.rollover;
		this.forcemerge = builder.forcemerge;
		this.shrink = builder.shrink;

	}

	public static Configurations of(Function<Builder, ObjectBuilder<Configurations>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code rollover}
	 */
	@Nullable
	public final RolloverConditions rollover() {
		return this.rollover;
	}

	/**
	 * API name: {@code forcemerge}
	 */
	@Nullable
	public final ForceMergeConfiguration forcemerge() {
		return this.forcemerge;
	}

	/**
	 * API name: {@code shrink}
	 */
	@Nullable
	public final ShrinkConfiguration shrink() {
		return this.shrink;
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

		if (this.rollover != null) {
			generator.writeKey("rollover");
			this.rollover.serialize(generator, mapper);

		}
		if (this.forcemerge != null) {
			generator.writeKey("forcemerge");
			this.forcemerge.serialize(generator, mapper);

		}
		if (this.shrink != null) {
			generator.writeKey("shrink");
			this.shrink.serialize(generator, mapper);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Configurations}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<Configurations> {
		@Nullable
		private RolloverConditions rollover;

		@Nullable
		private ForceMergeConfiguration forcemerge;

		@Nullable
		private ShrinkConfiguration shrink;

		/**
		 * API name: {@code rollover}
		 */
		public final Builder rollover(@Nullable RolloverConditions value) {
			this.rollover = value;
			return this;
		}

		/**
		 * API name: {@code rollover}
		 */
		public final Builder rollover(Function<RolloverConditions.Builder, ObjectBuilder<RolloverConditions>> fn) {
			return this.rollover(fn.apply(new RolloverConditions.Builder()).build());
		}

		/**
		 * API name: {@code forcemerge}
		 */
		public final Builder forcemerge(@Nullable ForceMergeConfiguration value) {
			this.forcemerge = value;
			return this;
		}

		/**
		 * API name: {@code forcemerge}
		 */
		public final Builder forcemerge(
				Function<ForceMergeConfiguration.Builder, ObjectBuilder<ForceMergeConfiguration>> fn) {
			return this.forcemerge(fn.apply(new ForceMergeConfiguration.Builder()).build());
		}

		/**
		 * API name: {@code shrink}
		 */
		public final Builder shrink(@Nullable ShrinkConfiguration value) {
			this.shrink = value;
			return this;
		}

		/**
		 * API name: {@code shrink}
		 */
		public final Builder shrink(Function<ShrinkConfiguration.Builder, ObjectBuilder<ShrinkConfiguration>> fn) {
			return this.shrink(fn.apply(new ShrinkConfiguration.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Configurations}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Configurations build() {
			_checkSingleUse();

			return new Configurations(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Configurations}
	 */
	public static final JsonpDeserializer<Configurations> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Configurations::setupConfigurationsDeserializer);

	protected static void setupConfigurationsDeserializer(ObjectDeserializer<Configurations.Builder> op) {

		op.add(Builder::rollover, RolloverConditions._DESERIALIZER, "rollover");
		op.add(Builder::forcemerge, ForceMergeConfiguration._DESERIALIZER, "forcemerge");
		op.add(Builder::shrink, ShrinkConfiguration._DESERIALIZER, "shrink");

	}

}
