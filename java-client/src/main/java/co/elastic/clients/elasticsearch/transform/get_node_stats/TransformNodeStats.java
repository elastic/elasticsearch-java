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

package co.elastic.clients.elasticsearch.transform.get_node_stats;

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

// typedef: transform.get_node_stats.TransformNodeStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#transform.get_node_stats.TransformNodeStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransformNodeStats implements JsonpSerializable {
	private final TransformSchedulerStats scheduler;

	// ---------------------------------------------------------------------------------------------

	private TransformNodeStats(Builder builder) {

		this.scheduler = ApiTypeHelper.requireNonNull(builder.scheduler, this, "scheduler");

	}

	public static TransformNodeStats of(Function<Builder, ObjectBuilder<TransformNodeStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code scheduler}
	 */
	public final TransformSchedulerStats scheduler() {
		return this.scheduler;
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

		generator.writeKey("scheduler");
		this.scheduler.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformNodeStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TransformNodeStats> {
		private TransformSchedulerStats scheduler;

		public Builder() {
		}
		private Builder(TransformNodeStats instance) {
			this.scheduler = instance.scheduler;

		}
		/**
		 * Required - API name: {@code scheduler}
		 */
		public final Builder scheduler(TransformSchedulerStats value) {
			this.scheduler = value;
			return this;
		}

		/**
		 * Required - API name: {@code scheduler}
		 */
		public final Builder scheduler(
				Function<TransformSchedulerStats.Builder, ObjectBuilder<TransformSchedulerStats>> fn) {
			return this.scheduler(fn.apply(new TransformSchedulerStats.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransformNodeStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformNodeStats build() {
			_checkSingleUse();

			return new TransformNodeStats(this);
		}
	}

	/**
	 * @return New {@link Builder} initialized with field values of this instance
	 */
	public Builder rebuild() {
		return new Builder(this);
	}
	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TransformNodeStats}
	 */
	public static final JsonpDeserializer<TransformNodeStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TransformNodeStats::setupTransformNodeStatsDeserializer);

	protected static void setupTransformNodeStatsDeserializer(ObjectDeserializer<TransformNodeStats.Builder> op) {

		op.add(Builder::scheduler, TransformSchedulerStats._DESERIALIZER, "scheduler");

	}

}
