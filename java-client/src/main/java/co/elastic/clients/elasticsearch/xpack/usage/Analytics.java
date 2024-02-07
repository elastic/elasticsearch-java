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

package co.elastic.clients.elasticsearch.xpack.usage;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
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

// typedef: xpack.usage.Analytics

/**
 *
 * @see <a href="../../doc-files/api-spec.html#xpack.usage.Analytics">API
 *      specification</a>
 */
@JsonpDeserializable
public class Analytics extends Base {
	private final AnalyticsStatistics stats;

	// ---------------------------------------------------------------------------------------------

	private Analytics(Builder builder) {
		super(builder);

		this.stats = ApiTypeHelper.requireNonNull(builder.stats, this, "stats");

	}

	public static Analytics of(Function<Builder, ObjectBuilder<Analytics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code stats}
	 */
	public final AnalyticsStatistics stats() {
		return this.stats;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link Analytics}.
	 */

	public static class Builder extends Base.AbstractBuilder<Builder> implements ObjectBuilder<Analytics> {
		private AnalyticsStatistics stats;

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(AnalyticsStatistics value) {
			this.stats = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(Function<AnalyticsStatistics.Builder, ObjectBuilder<AnalyticsStatistics>> fn) {
			return this.stats(fn.apply(new AnalyticsStatistics.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link Analytics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public Analytics build() {
			_checkSingleUse();

			return new Analytics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link Analytics}
	 */
	public static final JsonpDeserializer<Analytics> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			Analytics::setupAnalyticsDeserializer);

	protected static void setupAnalyticsDeserializer(ObjectDeserializer<Analytics.Builder> op) {
		Base.setupBaseDeserializer(op);
		op.add(Builder::stats, AnalyticsStatistics._DESERIALIZER, "stats");

	}

}
