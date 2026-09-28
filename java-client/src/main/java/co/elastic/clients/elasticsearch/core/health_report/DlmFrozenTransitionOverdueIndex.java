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

package co.elastic.clients.elasticsearch.core.health_report;

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

// typedef: _global.health_report.DlmFrozenTransitionOverdueIndex

/**
 *
 * @see <a href=
 *      "../../doc-files/api-spec.html#_global.health_report.DlmFrozenTransitionOverdueIndex">API
 *      specification</a>
 */
@JsonpDeserializable
public class DlmFrozenTransitionOverdueIndex implements JsonpSerializable {
	private final String indexName;

	private final DlmFrozenTransitionState transitionState;

	// ---------------------------------------------------------------------------------------------

	private DlmFrozenTransitionOverdueIndex(Builder builder) {

		this.indexName = ApiTypeHelper.requireNonNull(builder.indexName, this, "indexName");
		this.transitionState = ApiTypeHelper.requireNonNull(builder.transitionState, this, "transitionState");

	}

	public static DlmFrozenTransitionOverdueIndex of(
			Function<Builder, ObjectBuilder<DlmFrozenTransitionOverdueIndex>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code index_name}
	 */
	public final String indexName() {
		return this.indexName;
	}

	/**
	 * Required - API name: {@code transition_state}
	 */
	public final DlmFrozenTransitionState transitionState() {
		return this.transitionState;
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

		generator.writeKey("index_name");
		generator.write(this.indexName);

		generator.writeKey("transition_state");
		this.transitionState.serialize(generator, mapper);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link DlmFrozenTransitionOverdueIndex}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<DlmFrozenTransitionOverdueIndex> {
		private String indexName;

		private DlmFrozenTransitionState transitionState;

		public Builder() {
		}
		private Builder(DlmFrozenTransitionOverdueIndex instance) {
			this.indexName = instance.indexName;
			this.transitionState = instance.transitionState;

		}
		/**
		 * Required - API name: {@code index_name}
		 */
		public final Builder indexName(String value) {
			this.indexName = value;
			return this;
		}

		/**
		 * Required - API name: {@code transition_state}
		 */
		public final Builder transitionState(DlmFrozenTransitionState value) {
			this.transitionState = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link DlmFrozenTransitionOverdueIndex}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public DlmFrozenTransitionOverdueIndex build() {
			_checkSingleUse();

			return new DlmFrozenTransitionOverdueIndex(this);
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
	 * Json deserializer for {@link DlmFrozenTransitionOverdueIndex}
	 */
	public static final JsonpDeserializer<DlmFrozenTransitionOverdueIndex> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, DlmFrozenTransitionOverdueIndex::setupDlmFrozenTransitionOverdueIndexDeserializer);

	protected static void setupDlmFrozenTransitionOverdueIndexDeserializer(
			ObjectDeserializer<DlmFrozenTransitionOverdueIndex.Builder> op) {

		op.add(Builder::indexName, JsonpDeserializer.stringDeserializer(), "index_name");
		op.add(Builder::transitionState, DlmFrozenTransitionState._DESERIALIZER, "transition_state");

	}

}
