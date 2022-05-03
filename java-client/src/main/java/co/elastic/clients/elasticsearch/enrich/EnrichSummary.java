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

// typedef: enrich._types.Summary

/**
 *
 * @see <a href="../doc-files/api-spec.html#enrich._types.Summary">API
 *      specification</a>
 */
@JsonpDeserializable
public class EnrichSummary implements JsonpSerializable {
	private final EnrichConfiguration config;

	// ---------------------------------------------------------------------------------------------

	private EnrichSummary(Builder builder) {

		this.config = ApiTypeHelper.requireNonNull(builder.config, this, "config");

	}

	public static EnrichSummary of(Function<Builder, ObjectBuilder<EnrichSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code config}
	 */
	public final EnrichConfiguration config() {
		return this.config;
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

		generator.writeKey("config");
		this.config.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link EnrichSummary}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<EnrichSummary> {
		private EnrichConfiguration config;

		/**
		 * Required - API name: {@code config}
		 */
		public final Builder config(EnrichConfiguration value) {
			this.config = value;
			return this;
		}

		/**
		 * Required - API name: {@code config}
		 */
		public final Builder config(Function<EnrichConfiguration.Builder, ObjectBuilder<EnrichConfiguration>> fn) {
			return this.config(fn.apply(new EnrichConfiguration.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link EnrichSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public EnrichSummary build() {
			_checkSingleUse();

			return new EnrichSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link EnrichSummary}
	 */
	public static final JsonpDeserializer<EnrichSummary> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			EnrichSummary::setupEnrichSummaryDeserializer);

	protected static void setupEnrichSummaryDeserializer(ObjectDeserializer<EnrichSummary.Builder> op) {

		op.add(Builder::config, EnrichConfiguration._DESERIALIZER, "config");

	}

}
