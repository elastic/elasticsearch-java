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

import co.elastic.clients.elasticsearch.ilm.Phases;
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

// typedef: xpack.usage.IlmPolicyStatistics

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#xpack.usage.IlmPolicyStatistics">API
 *      specification</a>
 */
@JsonpDeserializable
public class IlmPolicyStatistics implements JsonpSerializable {
	private final int indicesManaged;

	private final Phases phases;

	// ---------------------------------------------------------------------------------------------

	private IlmPolicyStatistics(Builder builder) {

		this.indicesManaged = ApiTypeHelper.requireNonNull(builder.indicesManaged, this, "indicesManaged");
		this.phases = ApiTypeHelper.requireNonNull(builder.phases, this, "phases");

	}

	public static IlmPolicyStatistics of(Function<Builder, ObjectBuilder<IlmPolicyStatistics>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code indices_managed}
	 */
	public final int indicesManaged() {
		return this.indicesManaged;
	}

	/**
	 * Required - API name: {@code phases}
	 */
	public final Phases phases() {
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

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link IlmPolicyStatistics}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<IlmPolicyStatistics> {
		private Integer indicesManaged;

		private Phases phases;

		/**
		 * Required - API name: {@code indices_managed}
		 */
		public final Builder indicesManaged(int value) {
			this.indicesManaged = value;
			return this;
		}

		/**
		 * Required - API name: {@code phases}
		 */
		public final Builder phases(Phases value) {
			this.phases = value;
			return this;
		}

		/**
		 * Required - API name: {@code phases}
		 */
		public final Builder phases(Function<Phases.Builder, ObjectBuilder<Phases>> fn) {
			return this.phases(fn.apply(new Phases.Builder()).build());
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link IlmPolicyStatistics}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public IlmPolicyStatistics build() {
			_checkSingleUse();

			return new IlmPolicyStatistics(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link IlmPolicyStatistics}
	 */
	public static final JsonpDeserializer<IlmPolicyStatistics> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, IlmPolicyStatistics::setupIlmPolicyStatisticsDeserializer);

	protected static void setupIlmPolicyStatisticsDeserializer(ObjectDeserializer<IlmPolicyStatistics.Builder> op) {

		op.add(Builder::indicesManaged, JsonpDeserializer.integerDeserializer(), "indices_managed");
		op.add(Builder::phases, Phases._DESERIALIZER, "phases");

	}

}
