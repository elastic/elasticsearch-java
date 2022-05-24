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

package co.elastic.clients.elasticsearch.enrich;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: enrich._types.Configuration

/**
 *
 * @see <a href="../doc-files/api-spec.html#enrich._types.Configuration">API
 *      specification</a>
 */
@JsonpDeserializable
public class EnrichConfiguration implements JsonpSerializable {
	@Nullable
	private final EnrichPolicy geoMatch;

	private final EnrichPolicy match;

	private final EnrichPolicy range;

	// ---------------------------------------------------------------------------------------------

	private EnrichConfiguration(Builder builder) {

		this.geoMatch = builder.geoMatch;
		this.match = ApiTypeHelper.requireNonNull(builder.match, this, "match");
		this.range = ApiTypeHelper.requireNonNull(builder.range, this, "range");

	}

	public static EnrichConfiguration of(Function<Builder, ObjectBuilder<EnrichConfiguration>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * API name: {@code geo_match}
	 */
	@Nullable
	public final EnrichPolicy geoMatch() {
		return this.geoMatch;
	}

	/**
	 * Required - API name: {@code match}
	 */
	public final EnrichPolicy match() {
		return this.match;
	}

	/**
	 * Required - API name: {@code range}
	 */
	public final EnrichPolicy range() {
		return this.range;
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

		if (this.geoMatch != null) {
			generator.writeKey("geo_match");
			this.geoMatch.serialize(generator, mapper);

		}
		generator.writeKey("match");
		this.match.serialize(generator, mapper);

		generator.writeKey("range");
		this.range.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EnrichConfiguration}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<EnrichConfiguration> {
		@Nullable
		private EnrichPolicy geoMatch;

		private EnrichPolicy match;

		private EnrichPolicy range;

		/**
		 * API name: {@code geo_match}
		 */
		public final Builder geoMatch(@Nullable EnrichPolicy value) {
			this.geoMatch = value;
			return this;
		}

		/**
		 * API name: {@code geo_match}
		 */
		public final Builder geoMatch(Function<EnrichPolicy.Builder, ObjectBuilder<EnrichPolicy>> fn) {
			return this.geoMatch(fn.apply(new EnrichPolicy.Builder()).build());
		}

		/**
		 * Required - API name: {@code match}
		 */
		public final Builder match(EnrichPolicy value) {
			this.match = value;
			return this;
		}

		/**
		 * Required - API name: {@code match}
		 */
		public final Builder match(Function<EnrichPolicy.Builder, ObjectBuilder<EnrichPolicy>> fn) {
			return this.match(fn.apply(new EnrichPolicy.Builder()).build());
		}

		/**
		 * Required - API name: {@code range}
		 */
		public final Builder range(EnrichPolicy value) {
			this.range = value;
			return this;
		}

		/**
		 * Required - API name: {@code range}
		 */
		public final Builder range(Function<EnrichPolicy.Builder, ObjectBuilder<EnrichPolicy>> fn) {
			return this.range(fn.apply(new EnrichPolicy.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EnrichConfiguration}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EnrichConfiguration build() {
			_checkSingleUse();

			return new EnrichConfiguration(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EnrichConfiguration}
	 */
	public static final JsonpDeserializer<EnrichConfiguration> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, EnrichConfiguration::setupEnrichConfigurationDeserializer);

	protected static void setupEnrichConfigurationDeserializer(ObjectDeserializer<EnrichConfiguration.Builder> op) {

		op.add(Builder::geoMatch, EnrichPolicy._DESERIALIZER, "geo_match");
		op.add(Builder::match, EnrichPolicy._DESERIALIZER, "match");
		op.add(Builder::range, EnrichPolicy._DESERIALIZER, "range");

	}

}
