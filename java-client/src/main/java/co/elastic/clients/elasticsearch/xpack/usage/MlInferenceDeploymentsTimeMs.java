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

package co.elastic.clients.elasticsearch.xpack.usage;

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
import java.lang.Double;
import java.util.Objects;
import java.util.function.Function;

// typedef: xpack.usage.MlInferenceDeploymentsTimeMs

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.MlInferenceDeploymentsTimeMs">API
 *      specification</a>
 */
@JsonpDeserializable
public class MlInferenceDeploymentsTimeMs implements JsonpSerializable {
	private final double avg;

	// ---------------------------------------------------------------------------------------------

	private MlInferenceDeploymentsTimeMs(Builder builder) {

		this.avg = ApiTypeHelper.requireNonNull(builder.avg, this, "avg");

	}

	public static MlInferenceDeploymentsTimeMs of(Function<Builder, ObjectBuilder<MlInferenceDeploymentsTimeMs>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code avg}
	 */
	public final double avg() {
		return this.avg;
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

		generator.writeKey("avg");
		generator.write(this.avg);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link MlInferenceDeploymentsTimeMs}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<MlInferenceDeploymentsTimeMs> {
		private Double avg;

		/**
		 * Required - API name: {@code avg}
		 */
		public final Builder avg(double value) {
			this.avg = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link MlInferenceDeploymentsTimeMs}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public MlInferenceDeploymentsTimeMs build() {
			_checkSingleUse();

			return new MlInferenceDeploymentsTimeMs(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link MlInferenceDeploymentsTimeMs}
	 */
	public static final JsonpDeserializer<MlInferenceDeploymentsTimeMs> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, MlInferenceDeploymentsTimeMs::setupMlInferenceDeploymentsTimeMsDeserializer);

	protected static void setupMlInferenceDeploymentsTimeMsDeserializer(
			ObjectDeserializer<MlInferenceDeploymentsTimeMs.Builder> op) {

		op.add(Builder::avg, JsonpDeserializer.doubleDeserializer(), "avg");

	}

}
