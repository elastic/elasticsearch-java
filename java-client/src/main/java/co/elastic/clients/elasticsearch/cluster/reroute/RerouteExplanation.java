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

package co.elastic.clients.elasticsearch.cluster.reroute;

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
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: cluster.reroute.RerouteExplanation

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#cluster.reroute.RerouteExplanation">API
 *      specification</a>
 */
@JsonpDeserializable
public class RerouteExplanation implements JsonpSerializable {
	private final String command;

	private final List<RerouteDecision> decisions;

	private final RerouteParameters parameters;

	// ---------------------------------------------------------------------------------------------

	private RerouteExplanation(Builder builder) {

		this.command = ApiTypeHelper.requireNonNull(builder.command, this, "command");
		this.decisions = ApiTypeHelper.unmodifiableRequired(builder.decisions, this, "decisions");
		this.parameters = ApiTypeHelper.requireNonNull(builder.parameters, this, "parameters");

	}

	public static RerouteExplanation of(Function<Builder, ObjectBuilder<RerouteExplanation>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code command}
	 */
	public final String command() {
		return this.command;
	}

	/**
	 * Required - API name: {@code decisions}
	 */
	public final List<RerouteDecision> decisions() {
		return this.decisions;
	}

	/**
	 * Required - API name: {@code parameters}
	 */
	public final RerouteParameters parameters() {
		return this.parameters;
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

		generator.writeKey("command");
		generator.write(this.command);

		if (ApiTypeHelper.isDefined(this.decisions)) {
			generator.writeKey("decisions");
			generator.writeStartArray();
			for (RerouteDecision item0 : this.decisions) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		generator.writeKey("parameters");
		this.parameters.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RerouteExplanation}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<RerouteExplanation> {
		private String command;

		private List<RerouteDecision> decisions;

		private RerouteParameters parameters;

		/**
		 * Required - API name: {@code command}
		 */
		public final Builder command(String value) {
			this.command = value;
			return this;
		}

		/**
		 * Required - API name: {@code decisions}
		 * <p>
		 * Adds all elements of <code>list</code> to <code>decisions</code>.
		 */
		public final Builder decisions(List<RerouteDecision> list) {
			this.decisions = _listAddAll(this.decisions, list);
			return this;
		}

		/**
		 * Required - API name: {@code decisions}
		 * <p>
		 * Adds one or more values to <code>decisions</code>.
		 */
		public final Builder decisions(RerouteDecision value, RerouteDecision... values) {
			this.decisions = _listAdd(this.decisions, value, values);
			return this;
		}

		/**
		 * Required - API name: {@code decisions}
		 * <p>
		 * Adds a value to <code>decisions</code> using a builder lambda.
		 */
		public final Builder decisions(Function<RerouteDecision.Builder, ObjectBuilder<RerouteDecision>> fn) {
			return decisions(fn.apply(new RerouteDecision.Builder()).build());
		}

		/**
		 * Required - API name: {@code parameters}
		 */
		public final Builder parameters(RerouteParameters value) {
			this.parameters = value;
			return this;
		}

		/**
		 * Required - API name: {@code parameters}
		 */
		public final Builder parameters(Function<RerouteParameters.Builder, ObjectBuilder<RerouteParameters>> fn) {
			return this.parameters(fn.apply(new RerouteParameters.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RerouteExplanation}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RerouteExplanation build() {
			_checkSingleUse();

			return new RerouteExplanation(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RerouteExplanation}
	 */
	public static final JsonpDeserializer<RerouteExplanation> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, RerouteExplanation::setupRerouteExplanationDeserializer);

	protected static void setupRerouteExplanationDeserializer(ObjectDeserializer<RerouteExplanation.Builder> op) {

		op.add(Builder::command, JsonpDeserializer.stringDeserializer(), "command");
		op.add(Builder::decisions, JsonpDeserializer.arrayDeserializer(RerouteDecision._DESERIALIZER), "decisions");
		op.add(Builder::parameters, RerouteParameters._DESERIALIZER, "parameters");

	}

}
