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

// typedef: ilm._types.WaitForSnapshotAction

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#ilm._types.WaitForSnapshotAction">API
 *      specification</a>
 */
@JsonpDeserializable
public class WaitForSnapshotAction implements JsonpSerializable {
	private final String policy;

	// ---------------------------------------------------------------------------------------------

	private WaitForSnapshotAction(Builder builder) {

		this.policy = ApiTypeHelper.requireNonNull(builder.policy, this, "policy");

	}

	public static WaitForSnapshotAction of(Function<Builder, ObjectBuilder<WaitForSnapshotAction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code policy}
	 */
	public final String policy() {
		return this.policy;
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

		generator.writeKey("policy");
		generator.write(this.policy);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link WaitForSnapshotAction}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<WaitForSnapshotAction> {
		private String policy;

		/**
		 * Required - API name: {@code policy}
		 */
		public final Builder policy(String value) {
			this.policy = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link WaitForSnapshotAction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public WaitForSnapshotAction build() {
			_checkSingleUse();

			return new WaitForSnapshotAction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link WaitForSnapshotAction}
	 */
	public static final JsonpDeserializer<WaitForSnapshotAction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, WaitForSnapshotAction::setupWaitForSnapshotActionDeserializer);

	protected static void setupWaitForSnapshotActionDeserializer(ObjectDeserializer<WaitForSnapshotAction.Builder> op) {

		op.add(Builder::policy, JsonpDeserializer.stringDeserializer(), "policy");

	}

}
