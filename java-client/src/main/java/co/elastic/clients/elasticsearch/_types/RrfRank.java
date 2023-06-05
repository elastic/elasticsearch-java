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

package co.elastic.clients.elasticsearch._types;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.RrfRank

/**
 *
 * @see <a href="../doc-files/api-spec.html#_types.RrfRank">API
 *      specification</a>
 */
@JsonpDeserializable
public class RrfRank extends RankBase implements RankVariant, JsonpSerializable {
	@Nullable
	private final Long rankConstant;

	@Nullable
	private final Long windowSize;

	// ---------------------------------------------------------------------------------------------

	private RrfRank(Builder builder) {

		this.rankConstant = builder.rankConstant;
		this.windowSize = builder.windowSize;

	}

	public static RrfRank of(Function<Builder, ObjectBuilder<RrfRank>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Rank variant kind.
	 */
	@Override
	public Rank.Kind _rankKind() {
		return Rank.Kind.Rrf;
	}

	/**
	 * How much influence documents in individual result sets per query have over
	 * the final ranked result set
	 * <p>
	 * API name: {@code rank_constant}
	 */
	@Nullable
	public final Long rankConstant() {
		return this.rankConstant;
	}

	/**
	 * Size of the individual result sets per query
	 * <p>
	 * API name: {@code window_size}
	 */
	@Nullable
	public final Long windowSize() {
		return this.windowSize;
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

		if (this.rankConstant != null) {
			generator.writeKey("rank_constant");
			generator.write(this.rankConstant);

		}
		if (this.windowSize != null) {
			generator.writeKey("window_size");
			generator.write(this.windowSize);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RrfRank}.
	 */

	public static class Builder extends RankBase.AbstractBuilder<Builder> implements ObjectBuilder<RrfRank> {
		@Nullable
		private Long rankConstant;

		@Nullable
		private Long windowSize;

		/**
		 * How much influence documents in individual result sets per query have over
		 * the final ranked result set
		 * <p>
		 * API name: {@code rank_constant}
		 */
		public final Builder rankConstant(@Nullable Long value) {
			this.rankConstant = value;
			return this;
		}

		/**
		 * Size of the individual result sets per query
		 * <p>
		 * API name: {@code window_size}
		 */
		public final Builder windowSize(@Nullable Long value) {
			this.windowSize = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RrfRank}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RrfRank build() {
			_checkSingleUse();

			return new RrfRank(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RrfRank}
	 */
	public static final JsonpDeserializer<RrfRank> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RrfRank::setupRrfRankDeserializer);

	protected static void setupRrfRankDeserializer(ObjectDeserializer<RrfRank.Builder> op) {

		op.add(Builder::rankConstant, JsonpDeserializer.longDeserializer(), "rank_constant");
		op.add(Builder::windowSize, JsonpDeserializer.longDeserializer(), "window_size");

	}

}
