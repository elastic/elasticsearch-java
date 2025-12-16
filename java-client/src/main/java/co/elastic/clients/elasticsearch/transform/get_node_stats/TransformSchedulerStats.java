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

// typedef: transform.get_node_stats.TransformSchedulerStats

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#transform.get_node_stats.TransformSchedulerStats">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransformSchedulerStats implements JsonpSerializable {
	private final int registeredTransformCount;

	@Nullable
	private final String peekTransform;

	// ---------------------------------------------------------------------------------------------

	private TransformSchedulerStats(Builder builder) {

		this.registeredTransformCount = ApiTypeHelper.requireNonNull(builder.registeredTransformCount, this,
				"registeredTransformCount", 0);
		this.peekTransform = builder.peekTransform;

	}

	public static TransformSchedulerStats of(Function<Builder, ObjectBuilder<TransformSchedulerStats>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code registered_transform_count}
	 */
	public final int registeredTransformCount() {
		return this.registeredTransformCount;
	}

	/**
	 * API name: {@code peek_transform}
	 */
	@Nullable
	public final String peekTransform() {
		return this.peekTransform;
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

		generator.writeKey("registered_transform_count");
		generator.write(this.registeredTransformCount);

		if (this.peekTransform != null) {
			generator.writeKey("peek_transform");
			generator.write(this.peekTransform);

		}

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformSchedulerStats}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TransformSchedulerStats> {
		private Integer registeredTransformCount;

		@Nullable
		private String peekTransform;

		/**
		 * Required - API name: {@code registered_transform_count}
		 */
		public final Builder registeredTransformCount(int value) {
			this.registeredTransformCount = value;
			return this;
		}

		/**
		 * API name: {@code peek_transform}
		 */
		public final Builder peekTransform(@Nullable String value) {
			this.peekTransform = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransformSchedulerStats}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformSchedulerStats build() {
			_checkSingleUse();

			return new TransformSchedulerStats(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TransformSchedulerStats}
	 */
	public static final JsonpDeserializer<TransformSchedulerStats> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TransformSchedulerStats::setupTransformSchedulerStatsDeserializer);

	protected static void setupTransformSchedulerStatsDeserializer(
			ObjectDeserializer<TransformSchedulerStats.Builder> op) {

		op.add(Builder::registeredTransformCount, JsonpDeserializer.integerDeserializer(),
				"registered_transform_count");
		op.add(Builder::peekTransform, JsonpDeserializer.stringDeserializer(), "peek_transform");

	}

}
