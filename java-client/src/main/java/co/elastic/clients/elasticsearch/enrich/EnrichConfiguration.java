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
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.util.Objects;
import java.util.function.Consumer;
import javax.annotation.Nullable;

// typedef: enrich._types.Configuration
@JsonpDeserializable
public class EnrichConfiguration implements JsonpSerializable {
	@Nullable
	private final EnrichPolicy geoMatch;

	private final EnrichPolicy match;

	// ---------------------------------------------------------------------------------------------

	private EnrichConfiguration(Builder builder) {

		this.geoMatch = builder.geoMatch;
		this.match = ModelTypeHelper.requireNonNull(builder.match, this, "match");

	}

	public static EnrichConfiguration of(Consumer<Builder> fn) {
		Builder builder = new Builder();
		fn.accept(builder);
		return builder.build();
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

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EnrichConfiguration}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<EnrichConfiguration> {
		@Nullable
		private EnrichPolicy geoMatch;

		private EnrichPolicy match;

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
		public final Builder geoMatch(Consumer<EnrichPolicy.Builder> fn) {
			EnrichPolicy.Builder builder = new EnrichPolicy.Builder();
			fn.accept(builder);
			return this.geoMatch(builder.build());
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
		public final Builder match(Consumer<EnrichPolicy.Builder> fn) {
			EnrichPolicy.Builder builder = new EnrichPolicy.Builder();
			fn.accept(builder);
			return this.match(builder.build());
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

	}

}
