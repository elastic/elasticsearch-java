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

package co.elastic.clients.elasticsearch.ilm.move_to_step;

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
import java.lang.String;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ilm.move_to_step.StepKey

/**
 *
 * @see <a href="../../doc-files/api-spec.html#ilm.move_to_step.StepKey">API
 *      specification</a>
 */
@JsonpDeserializable
public class StepKey implements JsonpSerializable {
	private final String action;

	private final String name;

	private final String phase;

	// ---------------------------------------------------------------------------------------------

	private StepKey(Builder builder) {

		this.action = ApiTypeHelper.requireNonNull(builder.action, this, "action");
		this.name = ApiTypeHelper.requireNonNull(builder.name, this, "name");
		this.phase = ApiTypeHelper.requireNonNull(builder.phase, this, "phase");

	}

	public static StepKey of(Function<Builder, ObjectBuilder<StepKey>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code action}
	 */
	public final String action() {
		return this.action;
	}

	/**
	 * Required - API name: {@code name}
	 */
	public final String name() {
		return this.name;
	}

	/**
	 * Required - API name: {@code phase}
	 */
	public final String phase() {
		return this.phase;
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

		generator.writeKey("action");
		generator.write(this.action);

		generator.writeKey("name");
		generator.write(this.name);

		generator.writeKey("phase");
		generator.write(this.phase);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link StepKey}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<StepKey> {
		private String action;

		private String name;

		private String phase;

		/**
		 * Required - API name: {@code action}
		 */
		public final Builder action(String value) {
			this.action = value;
			return this;
		}

		/**
		 * Required - API name: {@code name}
		 */
		public final Builder name(String value) {
			this.name = value;
			return this;
		}

		/**
		 * Required - API name: {@code phase}
		 */
		public final Builder phase(String value) {
			this.phase = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link StepKey}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public StepKey build() {
			_checkSingleUse();

			return new StepKey(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link StepKey}
	 */
	public static final JsonpDeserializer<StepKey> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			StepKey::setupStepKeyDeserializer);

	protected static void setupStepKeyDeserializer(ObjectDeserializer<StepKey.Builder> op) {

		op.add(Builder::action, JsonpDeserializer.stringDeserializer(), "action");
		op.add(Builder::name, JsonpDeserializer.stringDeserializer(), "name");
		op.add(Builder::phase, JsonpDeserializer.stringDeserializer(), "phase");

	}

}
