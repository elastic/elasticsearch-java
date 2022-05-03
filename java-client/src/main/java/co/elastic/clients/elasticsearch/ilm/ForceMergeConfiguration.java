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

package co.elastic.clients.elasticsearch.ilm;

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
import java.util.Objects;
import java.util.function.Function;

// typedef: ilm._types.ForceMergeConfiguration

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ilm._types.ForceMergeConfiguration">API
 *      specification</a>
 */
@JsonpDeserializable
public class ForceMergeConfiguration implements JsonpSerializable {
	private final int maxNumSegments;

	// ---------------------------------------------------------------------------------------------

	private ForceMergeConfiguration(Builder builder) {

		this.maxNumSegments = ApiTypeHelper.requireNonNull(builder.maxNumSegments, this, "maxNumSegments");

	}

	public static ForceMergeConfiguration of(Function<Builder, ObjectBuilder<ForceMergeConfiguration>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code max_num_segments}
	 */
	public final int maxNumSegments() {
		return this.maxNumSegments;
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

		generator.writeKey("max_num_segments");
		generator.write(this.maxNumSegments);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link ForceMergeConfiguration}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ForceMergeConfiguration> {
		private Integer maxNumSegments;

		/**
		 * Required - API name: {@code max_num_segments}
		 */
		public final Builder maxNumSegments(int value) {
			this.maxNumSegments = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link ForceMergeConfiguration}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public ForceMergeConfiguration build() {
			_checkSingleUse();

			return new ForceMergeConfiguration(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link ForceMergeConfiguration}
	 */
	public static final JsonpDeserializer<ForceMergeConfiguration> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ForceMergeConfiguration::setupForceMergeConfigurationDeserializer);

	protected static void setupForceMergeConfigurationDeserializer(
			ObjectDeserializer<ForceMergeConfiguration.Builder> op) {

		op.add(Builder::maxNumSegments, JsonpDeserializer.integerDeserializer(), "max_num_segments");

	}

}
