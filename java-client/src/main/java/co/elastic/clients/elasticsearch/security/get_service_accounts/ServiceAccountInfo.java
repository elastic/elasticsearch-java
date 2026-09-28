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

package co.elastic.clients.elasticsearch.security.get_service_accounts;

import co.elastic.clients.json.JsonEnum;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.JsonpUtils;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ApiTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.TaggedUnion;
import co.elastic.clients.util.TaggedUnionUtils;
import co.elastic.clients.util.WithJsonObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
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

// typedef: security.get_service_accounts.ServiceAccountInfo

/**
 * The two kinds of service account describe their privileges differently. A
 * built-in account includes its role descriptor. A user-managed account
 * includes its role names and whether it is enabled.
 * 
 * @see <a href=
 *      "../../doc-files/api-spec.html#security.get_service_accounts.ServiceAccountInfo">API
 *      specification</a>
 */
@JsonpDeserializable
public class ServiceAccountInfo
		implements
			TaggedUnion<ServiceAccountInfo.Kind, ServiceAccountInfoVariant>,
			JsonpSerializable {

	/**
	 * {@link ServiceAccountInfo} variant kinds.
	 * 
	 * @see <a href=
	 *      "../../doc-files/api-spec.html#security.get_service_accounts.ServiceAccountInfo">API
	 *      specification</a>
	 */

	public enum Kind implements JsonEnum {
		BuiltIn("built_in"),

		UserManaged("user_managed"),

		;

		private final String jsonValue;

		Kind(String jsonValue) {
			this.jsonValue = jsonValue;
		}

		public String jsonValue() {
			return this.jsonValue;
		}

	}

	private final Kind _kind;
	private final ServiceAccountInfoVariant _value;

	@Override
	public final Kind _kind() {
		return _kind;
	}

	@Override
	public final ServiceAccountInfoVariant _get() {
		return _value;
	}

	public ServiceAccountInfo(ServiceAccountInfoVariant value) {

		this._kind = ApiTypeHelper.requireNonNull(value._serviceAccountInfoKind(), this, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(value, this, "<variant value>");

	}

	private ServiceAccountInfo(Builder builder) {

		this._kind = ApiTypeHelper.requireNonNull(builder._kind, builder, "<variant kind>");
		this._value = ApiTypeHelper.requireNonNull(builder._value, builder, "<variant value>");

	}

	public static ServiceAccountInfo of(Function<Builder, ObjectBuilder<ServiceAccountInfo>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Is this variant instance of kind {@code built_in}?
	 */
	public boolean isBuiltIn() {
		return _kind == Kind.BuiltIn;
	}

	/**
	 * Get the {@code built_in} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code built_in} kind.
	 */
	public BuiltInServiceAccount builtIn() {
		return TaggedUnionUtils.get(this, Kind.BuiltIn);
	}

	/**
	 * Is this variant instance of kind {@code user_managed}?
	 */
	public boolean isUserManaged() {
		return _kind == Kind.UserManaged;
	}

	/**
	 * Get the {@code user_managed} variant value.
	 *
	 * @throws IllegalStateException
	 *             if the current variant is not of the {@code user_managed} kind.
	 */
	public UserManagedServiceAccount userManaged() {
		return TaggedUnionUtils.get(this, Kind.UserManaged);
	}

	@Override
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {

		mapper.serialize(_value, generator);

	}

	@Override
	public String toString() {
		return JsonpUtils.toString(this);
	}

	public static class Builder extends WithJsonObjectBuilderBase<Builder>
			implements
				ObjectBuilder<ServiceAccountInfo> {
		private Kind _kind;
		private ServiceAccountInfoVariant _value;

		@Override
		protected Builder self() {
			return this;
		}
		public ObjectBuilder<ServiceAccountInfo> builtIn(BuiltInServiceAccount v) {
			this._kind = Kind.BuiltIn;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ServiceAccountInfo> builtIn(
				Function<BuiltInServiceAccount.Builder, ObjectBuilder<BuiltInServiceAccount>> fn) {
			return this.builtIn(fn.apply(new BuiltInServiceAccount.Builder()).build());
		}

		public ObjectBuilder<ServiceAccountInfo> userManaged(UserManagedServiceAccount v) {
			this._kind = Kind.UserManaged;
			this._value = v;
			return this;
		}

		public ObjectBuilder<ServiceAccountInfo> userManaged(
				Function<UserManagedServiceAccount.Builder, ObjectBuilder<UserManagedServiceAccount>> fn) {
			return this.userManaged(fn.apply(new UserManagedServiceAccount.Builder()).build());
		}

		public ServiceAccountInfo build() {
			_checkSingleUse();
			return new ServiceAccountInfo(this);
		}

	}

	protected static void setupServiceAccountInfoDeserializer(ObjectDeserializer<Builder> op) {

		op.add(Builder::builtIn, BuiltInServiceAccount._DESERIALIZER, "built_in");
		op.add(Builder::userManaged, UserManagedServiceAccount._DESERIALIZER, "user_managed");

		op.setTypeProperty("type", null);

	}

	public static final JsonpDeserializer<ServiceAccountInfo> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, ServiceAccountInfo::setupServiceAccountInfoDeserializer, Builder::build);
}
