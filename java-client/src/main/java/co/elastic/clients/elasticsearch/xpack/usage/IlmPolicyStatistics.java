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

import co.elastic.clients.elasticsearch.ilm.Phases;
import co.elastic.clients.json.DelegatingDeserializer;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: xpack.usage.IlmPolicyStatistics
@JsonpDeserializable
public final class IlmPolicyStatistics implements JsonpSerializable {
	private final int indicesManaged;

	private final Phases phases;

	// ---------------------------------------------------------------------------------------------

	public IlmPolicyStatistics(Builder builder) {

		this.indicesManaged = Objects.requireNonNull(builder.indicesManaged, "indices_managed");
		this.phases = Objects.requireNonNull(builder.phases, "phases");

	}

	/**
	 * API name: {@code indices_managed}
	 */
	public int indicesManaged() {
		return this.indicesManaged;
	}

	/**
	 * API name: {@code phases}
	 */
	public Phases phases() {
		return this.phases;
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

		generator.writeKey("indices_managed");
		generator.write(this.indicesManaged);

		generator.writeKey("phases");
		this.phases.serialize(generator, mapper);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IlmPolicyStatistics}.
	 */
	public static class Builder implements ObjectBuilder<IlmPolicyStatistics> {
		private Integer indicesManaged;

		private Phases phases;

		/**
		 * API name: {@code indices_managed}
		 */
		public Builder indicesManaged(int value) {
			this.indicesManaged = value;
			return this;
		}

		/**
		 * API name: {@code phases}
		 */
		public Builder phases(Phases value) {
			this.phases = value;
			return this;
		}

		/**
		 * API name: {@code phases}
		 */
		public Builder phases(Function<Phases.Builder, ObjectBuilder<Phases>> fn) {
			return this.phases(fn.apply(new Phases.Builder()).build());
		}

		/**
		 * Builds a {@link IlmPolicyStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IlmPolicyStatistics build() {

			return new IlmPolicyStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IlmPolicyStatistics}
	 */
	public static final JsonpDeserializer<IlmPolicyStatistics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IlmPolicyStatistics::setupIlmPolicyStatisticsDeserializer, Builder::build);

	protected static void setupIlmPolicyStatisticsDeserializer(DelegatingDeserializer<IlmPolicyStatistics.Builder> op) {

		op.add(Builder::indicesManaged, JsonpDeserializer.integerDeserializer(), "indices_managed");
		op.add(Builder::phases, Phases._DESERIALIZER, "phases");

	}

}
