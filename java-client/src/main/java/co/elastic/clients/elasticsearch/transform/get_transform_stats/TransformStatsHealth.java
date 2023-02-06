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

package co.elastic.clients.elasticsearch.transform.get_transform_stats;

import co.elastic.clients.elasticsearch._types.HealthStatus;
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

// typedef: transform.get_transform_stats.TransformStatsHealth

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#transform.get_transform_stats.TransformStatsHealth">API
 *      specification</a>
 */
@JsonpDeserializable
public class TransformStatsHealth implements JsonpSerializable {
	private final HealthStatus status;

	// ---------------------------------------------------------------------------------------------

	private TransformStatsHealth(Builder builder) {

		this.status = ApiTypeHelper.requireNonNull(builder.status, this, "status");

	}

	public static TransformStatsHealth of(Function<Builder, ObjectBuilder<TransformStatsHealth>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code status}
	 */
	public final HealthStatus status() {
		return this.status;
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

		generator.writeKey("status");
		this.status.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TransformStatsHealth}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<TransformStatsHealth> {
		private HealthStatus status;

		/**
		 * Required - API name: {@code status}
		 */
		public final Builder status(HealthStatus value) {
			this.status = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link TransformStatsHealth}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TransformStatsHealth build() {
			_checkSingleUse();

			return new TransformStatsHealth(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TransformStatsHealth}
	 */
	public static final JsonpDeserializer<TransformStatsHealth> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TransformStatsHealth::setupTransformStatsHealthDeserializer);

	protected static void setupTransformStatsHealthDeserializer(ObjectDeserializer<TransformStatsHealth.Builder> op) {

		op.add(Builder::status, HealthStatus._DESERIALIZER, "status");

	}

}
