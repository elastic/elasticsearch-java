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

package co.elastic.clients.elasticsearch.transform;

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

// typedef: transform.upgrade_transforms.Response

/**
 *
 * @see <a href=
 *      "../doc-files/api-spec.html#transform.upgrade_transforms.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class UpgradeTransformsResponse implements JsonpSerializable {
	private final int needsUpdate;

	private final int noAction;

	private final int updated;

	// ---------------------------------------------------------------------------------------------

	private UpgradeTransformsResponse(Builder builder) {

		this.needsUpdate = ApiTypeHelper.requireNonNull(builder.needsUpdate, this, "needsUpdate");
		this.noAction = ApiTypeHelper.requireNonNull(builder.noAction, this, "noAction");
		this.updated = ApiTypeHelper.requireNonNull(builder.updated, this, "updated");

	}

	public static UpgradeTransformsResponse of(Function<Builder, ObjectBuilder<UpgradeTransformsResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - The number of transforms that need to be upgraded.
	 * <p>
	 * API name: {@code needs_update}
	 */
	public final int needsUpdate() {
		return this.needsUpdate;
	}

	/**
	 * Required - The number of transforms that don’t require upgrading.
	 * <p>
	 * API name: {@code no_action}
	 */
	public final int noAction() {
		return this.noAction;
	}

	/**
	 * Required - The number of transforms that have been upgraded.
	 * <p>
	 * API name: {@code updated}
	 */
	public final int updated() {
		return this.updated;
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

		generator.writeKey("needs_update");
		generator.write(this.needsUpdate);

		generator.writeKey("no_action");
		generator.write(this.noAction);

		generator.writeKey("updated");
		generator.write(this.updated);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link UpgradeTransformsResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<UpgradeTransformsResponse> {
		private Integer needsUpdate;

		private Integer noAction;

		private Integer updated;

		/**
		 * Required - The number of transforms that need to be upgraded.
		 * <p>
		 * API name: {@code needs_update}
		 */
		public final Builder needsUpdate(int value) {
			this.needsUpdate = value;
			return this;
		}

		/**
		 * Required - The number of transforms that don’t require upgrading.
		 * <p>
		 * API name: {@code no_action}
		 */
		public final Builder noAction(int value) {
			this.noAction = value;
			return this;
		}

		/**
		 * Required - The number of transforms that have been upgraded.
		 * <p>
		 * API name: {@code updated}
		 */
		public final Builder updated(int value) {
			this.updated = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link UpgradeTransformsResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public UpgradeTransformsResponse build() {
			_checkSingleUse();

			return new UpgradeTransformsResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link UpgradeTransformsResponse}
	 */
	public static final JsonpDeserializer<UpgradeTransformsResponse> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, UpgradeTransformsResponse::setupUpgradeTransformsResponseDeserializer);

	protected static void setupUpgradeTransformsResponseDeserializer(
			ObjectDeserializer<UpgradeTransformsResponse.Builder> op) {

		op.add(Builder::needsUpdate, JsonpDeserializer.integerDeserializer(), "needs_update");
		op.add(Builder::noAction, JsonpDeserializer.integerDeserializer(), "no_action");
		op.add(Builder::updated, JsonpDeserializer.integerDeserializer(), "updated");

	}

}
