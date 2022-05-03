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

package co.elastic.clients.elasticsearch.indices;

import co.elastic.clients.elasticsearch._types.AcknowledgedResponse;
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
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: indices.rollover.Response

/**
 *
 * @see <a href="../doc-files/api-spec.html#indices.rollover.Response">API
 *      specification</a>
 */
@JsonpDeserializable
public class RolloverResponse implements AcknowledgedResponse, JsonpSerializable {
	private final boolean acknowledged;

	private final Map<String, Boolean> conditions;

	private final boolean dryRun;

	private final String newIndex;

	private final String oldIndex;

	private final boolean rolledOver;

	private final boolean shardsAcknowledged;

	// ---------------------------------------------------------------------------------------------

	private RolloverResponse(Builder builder) {

		this.acknowledged = ApiTypeHelper.requireNonNull(builder.acknowledged, this, "acknowledged");
		this.conditions = ApiTypeHelper.unmodifiableRequired(builder.conditions, this, "conditions");
		this.dryRun = ApiTypeHelper.requireNonNull(builder.dryRun, this, "dryRun");
		this.newIndex = ApiTypeHelper.requireNonNull(builder.newIndex, this, "newIndex");
		this.oldIndex = ApiTypeHelper.requireNonNull(builder.oldIndex, this, "oldIndex");
		this.rolledOver = ApiTypeHelper.requireNonNull(builder.rolledOver, this, "rolledOver");
		this.shardsAcknowledged = ApiTypeHelper.requireNonNull(builder.shardsAcknowledged, this, "shardsAcknowledged");

	}

	public static RolloverResponse of(Function<Builder, ObjectBuilder<RolloverResponse>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code acknowledged}
	 */
	public final boolean acknowledged() {
		return this.acknowledged;
	}

	/**
	 * Required - API name: {@code conditions}
	 */
	public final Map<String, Boolean> conditions() {
		return this.conditions;
	}

	/**
	 * Required - API name: {@code dry_run}
	 */
	public final boolean dryRun() {
		return this.dryRun;
	}

	/**
	 * Required - API name: {@code new_index}
	 */
	public final String newIndex() {
		return this.newIndex;
	}

	/**
	 * Required - API name: {@code old_index}
	 */
	public final String oldIndex() {
		return this.oldIndex;
	}

	/**
	 * Required - API name: {@code rolled_over}
	 */
	public final boolean rolledOver() {
		return this.rolledOver;
	}

	/**
	 * Required - API name: {@code shards_acknowledged}
	 */
	public final boolean shardsAcknowledged() {
		return this.shardsAcknowledged;
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

		generator.writeKey("acknowledged");
		generator.write(this.acknowledged);

		if (ApiTypeHelper.isDefined(this.conditions)) {
			generator.writeKey("conditions");
			generator.writeStartObject();
			for (Map.Entry<String, Boolean> item0 : this.conditions.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		generator.writeKey("dry_run");
		generator.write(this.dryRun);

		generator.writeKey("new_index");
		generator.write(this.newIndex);

		generator.writeKey("old_index");
		generator.write(this.oldIndex);

		generator.writeKey("rolled_over");
		generator.write(this.rolledOver);

		generator.writeKey("shards_acknowledged");
		generator.write(this.shardsAcknowledged);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RolloverResponse}.
	 */

	public static class Builder extends WithJsonObjectBuilderBase<Builder> implements ObjectBuilder<RolloverResponse> {
		private Boolean acknowledged;

		private Map<String, Boolean> conditions;

		private Boolean dryRun;

		private String newIndex;

		private String oldIndex;

		private Boolean rolledOver;

		private Boolean shardsAcknowledged;

		/**
		 * Required - API name: {@code acknowledged}
		 */
		public final Builder acknowledged(boolean value) {
			this.acknowledged = value;
			return this;
		}

		/**
		 * Required - API name: {@code conditions}
		 * <p>
		 * Adds all entries of <code>map</code> to <code>conditions</code>.
		 */
		public final Builder conditions(Map<String, Boolean> map) {
			this.conditions = _mapPutAll(this.conditions, map);
			return this;
		}

		/**
		 * Required - API name: {@code conditions}
		 * <p>
		 * Adds an entry to <code>conditions</code>.
		 */
		public final Builder conditions(String key, Boolean value) {
			this.conditions = _mapPut(this.conditions, key, value);
			return this;
		}

		/**
		 * Required - API name: {@code dry_run}
		 */
		public final Builder dryRun(boolean value) {
			this.dryRun = value;
			return this;
		}

		/**
		 * Required - API name: {@code new_index}
		 */
		public final Builder newIndex(String value) {
			this.newIndex = value;
			return this;
		}

		/**
		 * Required - API name: {@code old_index}
		 */
		public final Builder oldIndex(String value) {
			this.oldIndex = value;
			return this;
		}

		/**
		 * Required - API name: {@code rolled_over}
		 */
		public final Builder rolledOver(boolean value) {
			this.rolledOver = value;
			return this;
		}

		/**
		 * Required - API name: {@code shards_acknowledged}
		 */
		public final Builder shardsAcknowledged(boolean value) {
			this.shardsAcknowledged = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link RolloverResponse}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RolloverResponse build() {
			_checkSingleUse();

			return new RolloverResponse(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RolloverResponse}
	 */
	public static final JsonpDeserializer<RolloverResponse> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RolloverResponse::setupRolloverResponseDeserializer);

	protected static void setupRolloverResponseDeserializer(ObjectDeserializer<RolloverResponse.Builder> op) {

		op.add(Builder::acknowledged, JsonpDeserializer.booleanDeserializer(), "acknowledged");
		op.add(Builder::conditions, JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.booleanDeserializer()),
				"conditions");
		op.add(Builder::dryRun, JsonpDeserializer.booleanDeserializer(), "dry_run");
		op.add(Builder::newIndex, JsonpDeserializer.stringDeserializer(), "new_index");
		op.add(Builder::oldIndex, JsonpDeserializer.stringDeserializer(), "old_index");
		op.add(Builder::rolledOver, JsonpDeserializer.booleanDeserializer(), "rolled_over");
		op.add(Builder::shardsAcknowledged, JsonpDeserializer.booleanDeserializer(), "shards_acknowledged");

	}

}
