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

package co.elastic.clients.elasticsearch.indices.field_usage_stats;

import co.elastic.clients.elasticsearch.indices.stats.ShardRouting;
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

// typedef: indices.field_usage_stats.UsageStatsShards

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#indices.field_usage_stats.UsageStatsShards">API
 *      specification</a>
 */
@JsonpDeserializable
public class UsageStatsShards implements JsonpSerializable {
	private final ShardRouting routing;

	private final ShardsStats stats;

	private final String trackingId;

	private final long trackingStartedAtMillis;

	// ---------------------------------------------------------------------------------------------

	private UsageStatsShards(Builder builder) {

		this.routing = ApiTypeHelper.requireNonNull(builder.routing, this, "routing");
		this.stats = ApiTypeHelper.requireNonNull(builder.stats, this, "stats");
		this.trackingId = ApiTypeHelper.requireNonNull(builder.trackingId, this, "trackingId");
		this.trackingStartedAtMillis = ApiTypeHelper.requireNonNull(builder.trackingStartedAtMillis, this,
				"trackingStartedAtMillis");

	}

	public static UsageStatsShards of(Function<Builder, ObjectBuilder<UsageStatsShards>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code routing}
	 */
	public final ShardRouting routing() {
		return this.routing;
	}

	/**
	 * Required - API name: {@code stats}
	 */
	public final ShardsStats stats() {
		return this.stats;
	}

	/**
	 * Required - API name: {@code tracking_id}
	 */
	public final String trackingId() {
		return this.trackingId;
	}

	/**
	 * Required - API name: {@code tracking_started_at_millis}
	 */
	public final long trackingStartedAtMillis() {
		return this.trackingStartedAtMillis;
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

		generator.writeKey("routing");
		this.routing.serialize(generator, mapper);

		generator.writeKey("stats");
		this.stats.serialize(generator, mapper);

		generator.writeKey("tracking_id");
		generator.write(this.trackingId);

		generator.writeKey("tracking_started_at_millis");
		generator.write(this.trackingStartedAtMillis);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UsageStatsShards}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<UsageStatsShards> {
		private ShardRouting routing;

		private ShardsStats stats;

		private String trackingId;

		private Long trackingStartedAtMillis;

		/**
		 * Required - API name: {@code routing}
		 */
		public final Builder routing(ShardRouting value) {
			this.routing = value;
			return this;
		}

		/**
		 * Required - API name: {@code routing}
		 */
		public final Builder routing(Function<ShardRouting.Builder, ObjectBuilder<ShardRouting>> fn) {
			return this.routing(fn.apply(new ShardRouting.Builder()).build());
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(ShardsStats value) {
			this.stats = value;
			return this;
		}

		/**
		 * Required - API name: {@code stats}
		 */
		public final Builder stats(Function<ShardsStats.Builder, ObjectBuilder<ShardsStats>> fn) {
			return this.stats(fn.apply(new ShardsStats.Builder()).build());
		}

		/**
		 * Required - API name: {@code tracking_id}
		 */
		public final Builder trackingId(String value) {
			this.trackingId = value;
			return this;
		}

		/**
		 * Required - API name: {@code tracking_started_at_millis}
		 */
		public final Builder trackingStartedAtMillis(long value) {
			this.trackingStartedAtMillis = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UsageStatsShards}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UsageStatsShards build() {
			_checkSingleUse();

			return new UsageStatsShards(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UsageStatsShards}
	 */
	public static final JsonpDeserializer<UsageStatsShards> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			UsageStatsShards::setupUsageStatsShardsDeserializer);

	protected static void setupUsageStatsShardsDeserializer(ObjectDeserializer<UsageStatsShards.Builder> op) {

		op.add(Builder::routing, ShardRouting._DESERIALIZER, "routing");
		op.add(Builder::stats, ShardsStats._DESERIALIZER, "stats");
		op.add(Builder::trackingId, JsonpDeserializer.stringDeserializer(), "tracking_id");
		op.add(Builder::trackingStartedAtMillis, JsonpDeserializer.longDeserializer(), "tracking_started_at_millis");

	}

}
